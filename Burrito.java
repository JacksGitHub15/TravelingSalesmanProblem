package BurritoProject;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Burrito {
	public static void main(String args[]) {
		double[][] coords = new double [2][102];
		//location of burrito shop
		coords[0][0] = 53.38195; 	coords[1][0] = -6.59192;
		//coordinates of all the houses to be delivered to
		coords[0][1] = 53.3473;		coords[1][1] = -6.55057;
		coords[0][2] = 53.37077;	coords[1][2] = -6.48279;
		coords[0][3] = 53.35152;	coords[1][3] = -6.54989;
		coords[0][4] = 53.37278;	coords[1][4] = -6.59611;
		coords[0][5] = 53.40126;	coords[1][5] = -6.6683;
		coords[0][6] = 53.34484;	coords[1][6] = -6.54766;
	 	coords[0][7] = 53.34133;	coords[1][7] = -6.51856;
		coords[0][8] = 53.34492;	coords[1][8] = -6.5557;
		coords[0][9] = 53.29206;	coords[1][9] = -6.67685;
		coords[0][10] = 53.36483;	coords[1][10] = -6.51278;
		coords[0][11] = 53.33067;	coords[1][11] = -6.54686;
		coords[0][12] = 53.36287;	coords[1][12] = -6.52468;
		coords[0][13] = 53.37416;	coords[1][13] = -6.49494;
		coords[0][14] = 53.39549;	coords[1][14] = -6.67647;
		coords[0][15] = 53.33239;	coords[1][15] = -6.55163;
		coords[0][16] =  53.34678;	coords[1][16] = -6.53415;
		coords[0][17] =  53.36869;	coords[1][17] = -6.48314;
		coords[0][18] =  53.37521;	coords[1][18] = -6.6103;
		coords[0][19] =  53.33751;	coords[1][19] = -6.53173;
		coords[0][20] = 53.37184;	coords[1][20] = -6.50065;
		coords[0][21] =  53.36143;	coords[1][21] = -6.51849;
		coords[0][22] = 53.37473;	coords[1][22] = -6.59338;
		coords[0][23] =  53.34514;	coords[1][23] = -6.53615;
		coords[0][24] =  53.36115;	coords[1][24] = -6.48907;
		coords[0][25] =  53.39351;	coords[1][25] = -6.5542;
		coords[0][26] = 53.33886;	coords[1][26] = -6.55468;
		coords[0][27] =  53.36115;	coords[1][27] = -6.48907;
		coords[0][28] =  53.37497;	coords[1][28] = -6.4991;
		coords[0][29] = 53.37565;	coords[1][29] = -6.60716;
		coords[0][30] =  53.3354;	coords[1][30] = -6.55111;
		coords[0][31] =  53.36143;	coords[1][31] = -6.51849;
		coords[0][32] =  53.36115;	coords[1][32] = -6.48907;			
		coords[0][33] = 53.39459; 	coords[1][33] = -6.66995;
		coords[0][34] = 53.37122; 	coords[1][34] = -6.586;
		coords[0][35] = 53.36656; 	coords[1][35] = -6.49183;
		coords[0][36] = 53.36141; 	coords[1][36] = -6.51834;
		coords[0][37] = 53.37323; 	coords[1][37] = -6.58859;
		coords[0][38] = 53.36292; 	coords[1][38] = -6.50203;
		coords[0][39] = 53.38122; 	coords[1][39] = -6.59226;
		coords[0][40] = 53.35098; 	coords[1][40] = -6.54915;
		coords[0][41] = 53.34312; 	coords[1][41] = -6.54747;
		coords[0][42] = 53.34197; 	coords[1][42] = -6.55492;
		coords[0][43] = 53.37954; 	coords[1][43] = -6.58793;
		coords[0][44] = 53.33835; 	coords[1][44] = -6.53984;
		coords[0][45] = 53.36976; 	coords[1][45] = -6.59828;
		coords[0][46] = 53.37811; 	coords[1][46] = -6.57952;
		coords[0][47] = 53.39847; 	coords[1][47] = -6.66787;
		coords[0][48] = 53.38579; 	coords[1][48] = -6.58673;
		coords[0][49] = 53.37626; 	coords[1][49] = -6.59308;
		coords[0][50] = 53.37336; 	coords[1][50] = -6.48219;
		coords[0][51] = 53.33032; 	coords[1][51] = -6.55311;
		coords[0][52] = 53.37201; 	coords[1][52] = -6.48517;
		coords[0][53] = 53.37416; 	coords[1][53] = -6.49731;
		coords[0][54] = 53.36164; 	coords[1][54] = -6.50526;
		coords[0][55] = 53.37043; 	coords[1][55] = -6.48193;
		coords[0][56] = 53.35372; 	coords[1][56] = -6.54564;
		coords[0][57] = 53.2908; 	coords[1][57] = -6.67746;
		coords[0][58] = 53.39792;	coords[1][58] = -6.6711;
		coords[0][59] = 53.39315;	coords[1][59] = -6.66909;
		coords[0][60] = 53.34439; 	coords[1][60] = -6.53841;
		coords[0][61] = 53.33591; 	coords[1][61] = -6.53566;
		coords[0][62] = 53.3632; 	coords[1][62] = -6.51178;
		coords[0][63] = 53.36833; 	coords[1][63] = -6.50589;
		coords[0][64] = 53.35298; 	coords[1][64] = -6.54921;
		coords[0][65] = 53.38122; 	coords[1][65] = -6.59226;
		coords[0][66] = 53.33605; 	coords[1][66] = -6.53414;		
    	coords[0][67] = 53.33324; 	coords[1][67]= -6.53978;
    	coords[0][68] = 53.38039; 	coords[1][68]= -6.59368;
    	coords[0][69] =53.38039; 	coords[1][69]= -6.51468 ;
    	coords[0][70] = 53.35401; 	coords[1][70]= -6.54603;
    	coords[0][71] = 53.34745; 	coords[1][71]= -6.53401;
    	coords[0][72] = 53.39839; 	coords[1][72]= -6.66767;
    	coords[0][73] = 53.3473; 	coords[1][73]= -6.55057;
    	coords[0][74] = 53.29128; 	coords[1][74]= -6.67836;
    	coords[0][75] = 53.36158; 	coords[1][75]= -6.50533;
    	coords[0][76] = 53.3727; 	coords[1][76]= -6.58757;
    	coords[0][77] = 53.35321;	coords[1][77]= -6.55412;
    	coords[0][78] = 53.31159; 	coords[1][78]= -6.60538;
    	coords[0][79] = 53.36455; 	coords[1][79]= -6.51435;
    	coords[0][80] = 53.39999; 	coords[1][80]= -6.66807;
    	coords[0][81] = 53.37414; 	coords[1][81]= -6.60028;
    	coords[0][82] = 53.37402; 	coords[1][82]= -6.49363;
    	coords[0][83] = 53.38983; 	coords[1][83]= -6.5951;
    	coords[0][84] = 53.34033; 	coords[1][84]= -6.54596;
    	coords[0][85] = 53.28973; 	coords[1][85]= -6.67445;
    	coords[0][86] = 53.36518; 	coords[1][86]= -6.48913;
    	coords[0][87] = 53.36873; 	coords[1][87]= -6.49619;
    	coords[0][88] = 53.33256; 	coords[1][88]= -6.55056;
    	coords[0][89] = 53.37565; 	coords[1][89]= -6.60701;
    	coords[0][90] = 53.38895; 	coords[1][90]= -6.60579;
    	coords[0][91] = 53.34648; 	coords[1][91]= -6.54552;
    	coords[0][92] = 53.35202; 	coords[1][92]= -6.55099;
    	coords[0][93] = 53.37247; 	coords[1][93]= -6.60044;
    	coords[0][94] = 53.37449; 	coords[1][94]= -6.60005;
    	coords[0][95] = 53.36559; 	coords[1][95]= -6.51914;
    	coords[0][96] = 53.39648; 	coords[1][96]= -6.66612;
    	coords[0][97] = 53.33239; 	coords[1][97]= -6.55163;
    	coords[0][98] = 53.39512; 	coords[1][98]= -6.67084;
    	coords[0][99] = 53.33835; 	coords[1][99]= -6.53984;
    	coords[0][100] = 53.37538; 	coords[1][100]= -6.60707;
		
    	calc(coords);
    	
    	/*int[] optimal = new int[100];
    	for (int i = 0; i <=10; i++){
    		optimal = calc(coords);
		}
    	System.out.println("The returned delivery order: " + optimal);
    	
    	int minValue = optimal[0];
    	for (int j = 0; j < optimal.length; j++) {
    		if(optimal[j] < minValue) {
    			minValue = optimal[j];
    		}
    	}*/
	}
	// int[]
	public static void calc(double[][] coords) {
		final int R = 6371; // Radius of the earth
		double lat1 = 0;
		double lon1 = 0;
		double lat2 = 0;
		double lon2 = 0;
		double latDistance = 0;
		double lonDistance = 0;
		double a = 0;
		double c = 0;
		double distance = 0;
		double totalDistance = 0;
		double finaltotalDistance = 0;
		double tempTotalDistance = 0;
		int[] orderDelivery = new int[100];
		int[] tempOrderDelivery = new int[101];
	    Integer [] allRandom = new Integer[100];
	    boolean test = false;		

	    //for loop to shuffle the orders randomly
		for(int x = 0; x < 1;x++){
			for(int random = 1;random < 101;random++) {
				allRandom[random-1] = random;
			}
			Collections.shuffle(Arrays.asList(allRandom));
		
			// this is the main for loop used for finding the most optimal path of the drone.
			tempOrderDelivery[0]=0;
			for(int i = 0;i<=100;i++) {
			lat1 = 0;
			lon1 = 0;
			lat2 = 0;
			lon2 = 0;
			latDistance = 0;
			lonDistance = 0;
			
			 	if(i >= 0) {	
			 		if(i < 100) {
			 			tempOrderDelivery[i+1] = allRandom[i];
			 		}
			 	}

			 if(i <100) {
				 lat1 = coords[0][tempOrderDelivery[i]];
				 lon1 = coords[1][tempOrderDelivery[i]];
				 lat2 = coords[0][tempOrderDelivery[i+1]];
				 lon2 = coords[1][tempOrderDelivery[i+1]];
			 }
			 
			latDistance = toRad(lat2-lat1);
			lonDistance = toRad(lon2-lon1);
			a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2) + 
			Math.cos(toRad(lat1)) * Math.cos(toRad(lat2)) * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
			c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
			distance = R * c;
			totalDistance+=distance;
			//distance+=distance;
			// System.out.println("finished...");
			// System.out.println("[ DISTANCE BETWEEN: ]"+distance);
			// System.out.println("[ time taken: ]"+(totalDistance/80)*60);		 
			 //i++;
			if(i == 99) {
				finaltotalDistance = totalDistance;
				DecimalFormat f = new DecimalFormat("##.##");
				System.out.println("The total distance for the drone in this run: "+f.format(finaltotalDistance)+ " km");
				double timeTaken = (finaltotalDistance/80)*60;
				System.out.println("Total time taken: "+f.format(timeTaken)+" minutes"); 
			}
		}
		System.out.println("temp "+tempTotalDistance);
		System.out.println("final "+finaltotalDistance);
		if(finaltotalDistance <= tempTotalDistance || tempTotalDistance == 0)
		{
			tempTotalDistance = finaltotalDistance;
		}
		
		System.out.println("orderDelivery: "+Arrays.toString(orderDelivery));
		System.out.println("tempOrderDelK: "+Arrays.toString(tempOrderDelivery));
		
		if(finaltotalDistance <= tempTotalDistance) {
			test = true;
		}
		
		else{
			test = false;
		}
		
		if (test){
			orderDelivery = tempOrderDelivery;
			System.out.println("true");
		}
		
		test = false;
		System.out.println("The path the drone took: "+Arrays.toString(orderDelivery));
		//return orderDelivery;
		}		
	}
	
	private static double toRad(double value) {
		return value * Math.PI / 180;
	}
 
}
