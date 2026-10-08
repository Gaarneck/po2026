public class Choinka {
	public static void main(String[] args) {
    		int n = Integer.parseInt(args[0]);
    		for (int j = 1; j <= n; j++)
    		{
        		for (int i = 0; i < j; i++)
        		{
            			System.out.print("*");
        		}
        		System.out.println();
    		}
    		System.out.println();
	}
}
