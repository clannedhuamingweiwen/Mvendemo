import org.testng.Assert;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class tt001 {

    @Test()
    public void testEmailGenerator(){
        RandomEmailGenerator qa =new RandomEmailGenerator();
        String email =qa.generator();

        try {
            Assert.assertNotNull(email);
            Assert.assertEquals(email,"dns");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

