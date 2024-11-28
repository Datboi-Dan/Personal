/**
* These are a few methods that delay output for control over how things are displayed on the console.
* MILCS
*/
public final class DelayMethods
{

  /**
	 * This method prints the string index by index with a time increment of 20 milliseconds.
	 * I'm gonna be completely honest. I had it autogenerate that try catch block when I first created it.
	 * Hopefully by the time I finished the game I know how try catch works.
   * Edit: I do know now in fact how try catch works.
	 * @param string - The string that is being printed out.
	 */
  public static void delayPrintln(String string)
	{
		
		for (int index = 0; index < string.length(); index++)
		{
			
			String character = string.substring(index, index + 1);
					
			System.out.print(character);
			if (character.equals(".") || character.equals("?"))
			{
				
				delay();
				
			}
			else if (character.equals(","))
			{
				
				shortDelay();
			}
			else
			{
				try 
				{
					
					TimeUnit.MILLISECONDS.sleep(20);
					
				} 
				catch (InterruptedException e) 
				{
					
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
			
		}
		
		System.out.print("\n");
		
	}
	
	
	/**
	 * Overloaded method of delayPrintln for control over millisecond delay between index output.
	 * @param string - The string that is being printed out.
	 * @param milliseconds - The amount of delay you want between each index being printed in milliseconds.
	 */
	public static void delayPrintln(String string, int milliseconds)
	{
		
		for (int index = 0; index < string.length(); index++)
		{
			
			String character = string.substring(index, index + 1);
					
			System.out.print(character);
			if (character.equals(".") || character.equals("?") || character.equals("!"))
			{
				try 
				{
				
					TimeUnit.SECONDS.sleep(1);
				
				} 
				catch (InterruptedException e) 
				{
				
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
			}
			else if (character.equals(","))
			{
				try 
				{
					
					TimeUnit.MILLISECONDS.sleep(500);
					
				} 
				catch (InterruptedException e) 
				{
					
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
			else
			{
				try 
				{
					
					TimeUnit.MILLISECONDS.sleep(milliseconds);
					
				} 
				catch (InterruptedException e) 
				{
					
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
			
		}
		
		System.out.print("\n");
		
	}
	
	
	/**
	 * For when you don't need another line afterward.
	 * @param string - The string that is being printed out.
	 */
	public static void delayPrint(String string)
	{

		for (int index = 0; index < string.length(); index++)
		{
			
			String character = string.substring(index, index + 1);
					
			System.out.print(character);
			if (character.equals(".") || character.equals("?") || character.equals("!"))
			{
				try 
				{
				
					TimeUnit.SECONDS.sleep(1);
				
				} 
				catch (InterruptedException e) 
				{
				
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
			}
			else if (character.equals(","))
			{
				try 
				{
					
					TimeUnit.MILLISECONDS.sleep(500);
					
				} 
				catch (InterruptedException e) 
				{
					
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
			else
			{
				try 
				{
					
					TimeUnit.MILLISECONDS.sleep(20);
					
				} 
				catch (InterruptedException e) 
				{
					
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
			
		}
		
	}
	
	
	/**
	 * Overloaded method of delayPrint.
	 * @param string - The string that is being printed out.
	 */
	public static void delayPrint(String string, int milliseconds)
	{
		
		for (int index = 0; index < string.length(); index++)
		{
			
			String character = string.substring(index, index + 1);
					
			System.out.print(character);
			if (character.equals(".") || character.equals("?") || character.equals("!"))
			{
				try 
				{
				
					TimeUnit.SECONDS.sleep(1);
				
				} 
				catch (InterruptedException e) 
				{
				
					// TODO Auto-generated catch block
					e.printStackTrace();
				
				}
			}
			else if (character.equals(","))
			{
				try 
				{
					
					TimeUnit.MILLISECONDS.sleep(500);
					
				} 
				catch (InterruptedException e) 
				{
					
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
			else
			{
				try 
				{
					
					TimeUnit.MILLISECONDS.sleep(milliseconds);
					
				} 
				catch (InterruptedException e) 
				{
					
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
			}
			
		}
		
	}
	
	
	/**
	 * A method that delays output for 1 second.
	 */
	public static void delay()
	{
		
		try 
		{
			
			TimeUnit.SECONDS.sleep(1);
			
		} 
		catch (InterruptedException e) 
		{
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	
	/**
	 * Overloaded method of delay for control over output delay in seconds.
	 * @param seconds - The amount of time that you want to halt output for in seconds.
	 */
	public static void delay(int seconds)
	{
		
		try 
		{
			
			TimeUnit.SECONDS.sleep(seconds);
			
		} 
		catch (InterruptedException e) 
		{
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	/**
	 * A method that delays output for half a second.
	 */
	public static void shortDelay()
	{
		
		try 
		{
			
			TimeUnit.MILLISECONDS.sleep(500);
			
		} 
		catch (InterruptedException e) 
		{
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}
	
	
	/**
	 * Overloaded method of shortDelay for control over output delay in milliseconds.
	 * @param milliseconds - The amount of time that you want to halt output for in milliseconds.
	 */
	public static void shortDelay(int milliseconds)
	{
		
		try 
		{
			
			TimeUnit.MILLISECONDS.sleep(milliseconds);
			
		} 
		catch (InterruptedException e) 
		{
			
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
	}

}
  
}
