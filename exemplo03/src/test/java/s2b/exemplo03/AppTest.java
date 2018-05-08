package s2b.exemplo03;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
   
{
	@Test
	        
    public void testFiveAndFiveGivesExam()
    {
		String expected = "Em exame";
		String actual = Medias.calcular(5.0,5.0);
		assertEquals(expected, actual);
        
    }
	
	@Test
    
    public void testSevenSevenGivesAp()
    {
		String expected = "Aprovado";
		String actual = Medias.calcular(7.0,7.0);
		assertEquals(expected, actual);
        
    }
	
	@Test
    
    public void testThreeThreeGivesRep()
    {
		String expected = "Reprovado";
		String actual = Medias.calcular(3.0,3.0);
		assertEquals(expected, actual);
        
    }
	
@Test
    
    public void testThreeNineNineThreeNineNineGivesRep()
    {
		String expected = "Reprovado";
		String actual = Medias.calcular(3.99,3.99);
		assertEquals(expected, actual);
        
    }

@Test

public void testThreeNineNineNineThreeNineNineNineGivesRep()
{
	String expected = "Reprovado";
	String actual = Medias.calcular(3.999,3.999);
	assertEquals(expected, actual);
    
}

@Test
    
    public void testFourZeroOnefourZeroOneGivesAp()
    {
		String expected = "Em exame";
		String actual = Medias.calcular(4.01,4.01);
		assertEquals(expected, actual);
        
    }


}
