import org.testng.ITestContext;
import org.testng.annotations.BeforeSuite;

import java.util.HashMap;

public class BaseTest {

    DataPool dataPool;

    @BeforeSuite
    protected void beforeSuite( ITestContext testContext ) {
//        dataPool = new DataPool();
//        HashMap<String,String> parameters = new HashMap<>( testContext.getCurrentXmlTest().getAllParameters());
//        dataPool.processDataFile( parameters.get( "dataFile" ) );
    }
}
