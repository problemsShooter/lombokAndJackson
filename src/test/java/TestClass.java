import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestClass extends BaseTest {

    @Test
    public void testAccountModel(){

        Date dateOfBirth = new GregorianCalendar(90, 6, 12).getGregorianChange();

        Account firstAccount = new Account("John", "Doe", dateOfBirth, 90, 190 );

        Account secondAccount = new Account();
        secondAccount.setFirstName( "John" );
        secondAccount.setLastName( "Doe" );
        secondAccount.setDateOfBirth( dateOfBirth );
        secondAccount.setWeight( 90 );
        secondAccount.setHeight( 190 );

        Assert.assertEquals( firstAccount.toString(), secondAccount.toString() );

        Assert.assertEquals( firstAccount, secondAccount );
    }

    @Test
    public void testModelToJsonConversion() throws JsonProcessingException {
        Date dateOfBirth = new GregorianCalendar(90, 6, 12).getGregorianChange();

        Account firstAccount = new Account("John", "Doe", dateOfBirth, 90, 190 );

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable( SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);

        String jsonString = objectMapper.writeValueAsString( firstAccount );

        System.out.println( jsonString );
    }

    @Test
    public void testJsonToModelConversion() throws IOException {


        ObjectMapper objectMapper = new ObjectMapper();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        objectMapper.setDateFormat( dateFormat );

        Account account = objectMapper.readValue( new File( "src/test/data/data.json" ), Account.class );

        System.out.println( account );
    }


    @DataProvider
    private Object[][] dataProvider(){
        return dataPool.getData();
    }

    @Test( dataProvider = "dataProvider" )
    public void testGetAccountFromDataFile( Account account ) {

        System.out.println( account );
    }
}
