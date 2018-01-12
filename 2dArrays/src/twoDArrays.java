
public class twoDArrays
	{

		public static void main(String[] args)
			{
				columnChallenge();
				//MhsChallenge();
				//oneToNine();
				//threeDimension();
			}

		private static void columnChallenge()
			{
				int sum = 10;
				int num [] [] = new int [2] [3];
				
				for (int row = 0; row < 2; row++)
					{
						for(int column = 0; column < 3; column++)
							{
								System.out.println(num [row] [column] = sum);
								sum = sum + 10;
							}
					}
				
			}

		private static void MhsChallenge()
			{
				String letter [] [] = new String [4] [3];
				
				for(int row = 0; row < 4; row++)
					{
						for(int column = 0; column < 3; column++)
							{
								System.out.print(letter[row][column] = "MHS ");
								
							}
						System.out.println("");
					}
				
			}

		private static void oneToNine()
			{
				int num [] [] = new int [3] [3];
				
				int counter = 1;
				int sum = 0;
				
				for(int row = 0; row < 3; row++)
					{
						for(int column = 0; column < 3; column++)
							{
								System.out.print(num[row][column] = counter++);
								System.out.print(" ");
								sum = sum + counter;
								
							}
						System.out.println("");
					}
					
				System.out.println("The sum is " + sum);
			}

		private static void threeDimension()
			{
				int num [] [] [] = new int [3] [3] [3];
				
				int counter = 1;
				int sum = 0;
				
				for(int i = 0; i < 3; i++)
					{
						for(int j = 0; j <3; j++)
							{
								for(int h = 0; h < 3; h++)
									{
										System.out.print(num[i][j][h] = counter++);
										System.out.print(" ");
										sum = sum + counter;
									}
							}
						System.out.println(" ");
					}
				System.out.println("The sum is " + sum);
			}

	}
