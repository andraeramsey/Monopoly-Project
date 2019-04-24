
public class BoardArrayTest
{
	//http://stackoverflow.com/questions/34209044/make-a-square-shape-of-asterisc-around-border-of-2d-array
	public static void main(String[] args) 
	{
		int side = 11;
		int topBottom=11;
	    String [][] monopolyBoard = new String[side][topBottom];
	    for (int i = 0; i < monopolyBoard.length; i++)
	    {
	        for (int j = 0; j < monopolyBoard.length; j++)
	        {
	            if(i == 0 || (i == monopolyBoard.length-1 || j==0 || j==monopolyBoard.length-1))
	            { 
	            	monopolyBoard[i][j] = "|‾|";
	            	//create a new button in place of the text
	            }
	        }

	    }
	    //print test
	    for (int i = 0; i < monopolyBoard.length; i++)
	    {
	        for (int j = 0; j < monopolyBoard.length; j++)
	        {
	           System.out.print(monopolyBoard[i][j] + "");
	        }
	        System.out.println("");
	    }
	}
}
