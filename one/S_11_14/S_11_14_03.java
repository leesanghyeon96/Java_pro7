package S_11_14;

public class S_11_14_03 {

	public static void main(String[] args) {
		pos2: for ( int i = 0 ; i < 5 ; i++) {
			for ( int j = 0 ; j < 5 ; j++) {
				if ( j == 2) {
					continue pos2;
				}
				
				System.out.println(i + " , " + j);
			}
			System.out.println();
		}
	
		

	}

}
