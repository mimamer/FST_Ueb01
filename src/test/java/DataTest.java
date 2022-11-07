//Michelle Mergen - 1293151

import de.unitrier.st.core.CountryDataPoint;
import de.unitrier.st.core.DataLoader;
import de.unitrier.st.core.DataParser;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class DataTest {

    @Test
    public void tmpTest() {
        Assert.assertEquals(true, true);
    }
    @Test
    @Before public void dataLoaderFNFExceptionWorks(){
        DataLoader dataLoader = new DataLoader();
        //String json = dataLoader.loadJsonFile("fileNotFound.json");
        Assert.assertEquals("crash","blubb"); //easy to trigger a fail if someone wants to test the test

    }

}
