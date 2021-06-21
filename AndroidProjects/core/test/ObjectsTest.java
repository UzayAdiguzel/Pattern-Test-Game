import com.space.spacashooter.Meteor;
import com.space.spacashooter.ObserverManager;
import com.space.spacashooter.Satelite;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Objects;

public class ObjectsTest {

    @Test
    public void testSatelite(){
        Satelite testSatelite = new Satelite();
        String sateliteOutput = testSatelite.getFalligObjects("Satelite");
        sateliteOutput.equals("Satelite");
        //Objects.equals(sateliteOutput,"Satelite");
    }

    @Test
    public void testMeteor(){
        Meteor testMeteor = new Meteor();
        String meteorOutput = testMeteor.getFalligObjects("Meteor");
        meteorOutput.equals("Meteor");
    }

/*
    @Test
    public void testShield(){
        BigDecimal minShield = BigDecimal.valueOf(0);
        BigDecimal maxShield = BigDecimal.valueOf(10);

        ObserverManager testShield = new ObserverManager(minShield,maxShield);
        BigDecimal shieldOutput = testShield.getShield(BigDecimal.valueOf(1));
        shieldOutput.equals(1);
    }
 */

}
