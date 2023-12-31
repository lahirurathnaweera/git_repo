package listerners;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class Listener implements TestWatcher
{
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        TestWatcher.super.testDisabled(context, reason);
        System.out.println("This Test was disabled : " + context.getTestMethod() + "Reason : " + reason);
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        TestWatcher.super.testSuccessful(context);
        System.out.println("-----------------------");
        System.out.println("This Test was successful : " + context.getTestMethod());
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testAborted(context, cause);
        System.out.println("-----------------------");
        System.out.println("This Test was aborted : " + cause.getMessage());
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        TestWatcher.super.testFailed(context, cause);
        System.out.println("-----------------------");
        System.out.println("This Test was aborted : " + cause.getMessage());
    }
}
