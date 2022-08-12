package part22;

import part22.log.AbstractLogger;
import part22.log.DebugLogger;
import part22.log.ErrorLogger;
import part22.log.InfoLogger;

/**
 * @Author zhengcan
 * @Date 2022/8/10 17:06
 * @Version 1.0 行为型模式
 * @Description 责任链模式
 * 意图：避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 *
 * 主要解决：职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，无须关心请求的处理细节和请求的传递，
 * 所以职责链将请求的发送者和请求的处理者解耦了。
 *
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推
 *
 */
public class Part22Main {
    public static void main(String[] args) {
        /**
         * DebugLogger只能打印debug日志
         */
        AbstractLogger logger = initDebugLogger();
        logger.logMessage(AbstractLogger.DEBUG, "i am debug");
        logger.logMessage(AbstractLogger.INFO, "i am info");
        logger.logMessage(AbstractLogger.ERROR, "i am error");

        System.out.println("============================================");

        /**
         * InfoLogger能打印debug和info日志
         */
        logger = initInfoLogger();
        logger.logMessage(AbstractLogger.DEBUG, "i am debug");
        logger.logMessage(AbstractLogger.INFO, "i am info");
        logger.logMessage(AbstractLogger.ERROR, "i am error");

        System.out.println("============================================");

        /**
         * ErrorLogger能打印debug、info、error日志
         */
        logger = initErrorLogger();
        logger.logMessage(AbstractLogger.DEBUG, "i am debug");
        logger.logMessage(AbstractLogger.INFO, "i am info");
        logger.logMessage(AbstractLogger.ERROR, "i am error");

    }

    private static AbstractLogger initErrorLogger(){
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);
        return debugLogger;
    }

    private static AbstractLogger initInfoLogger(){
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        debugLogger.setNextLogger(infoLogger);
        return debugLogger;
    }

    private static AbstractLogger initDebugLogger(){
        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        return debugLogger;
    }
}
