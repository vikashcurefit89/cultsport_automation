/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package appiumtestsnew;

import org.testng.Assert;
import org.testng.annotations.Test;


class LibraryTest {
    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        Assert.assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }
}