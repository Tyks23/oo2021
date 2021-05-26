public class Kalkulaator implements KalkulaatoriLiides{
	String paneel;
	String malu;
	String kasutajamalu = "0";
	int jargminenr = 0;
	int liitmine = 0;
	int lahutamine = 0;
	int korrutamine = 0;
	int jagamine = 0;
	
	public void vajutus(String nupp){
		String sisestus = nupp;
		if(nupp.equals("C")){
			paneel = "0";
			malu = "";
			liitmine = 0;
			lahutamine = 0;
			korrutamine = 0;
		}
		else if(nupp.equals("m+")) {
            malu = "";
			if(kasutajamalu != "0"){
				int arvutus = Integer.parseInt(kasutajamalu) + Integer.parseInt(paneel);
				kasutajamalu = String.valueOf(arvutus);
				jargminenr = 1;
			}
			else{
				kasutajamalu = paneel;
				jargminenr = 1;
			}	
		}	
		else if(nupp.equals("mr")) {
			paneel = kasutajamalu;
            jargminenr = 1;	
		}
		else if(nupp.equals("mc")) {
            kasutajamalu = "0";
            jargminenr = 1;	
		}
		
		else if(nupp.equals("+")) {
            malu = paneel;
            liitmine = 1;
            jargminenr = 1;
        } 
		else if(nupp.equals("-")) {
            malu = paneel;
            lahutamine = 1;
            jargminenr = 1;
			
		}	
		else if(nupp.equals("*")) {
            malu = paneel;
            korrutamine = 1;
            jargminenr = 1;
			
		}	
		else if(nupp.equals("/")) {
            malu = paneel;
            jagamine = 1;
            jargminenr = 1;
		}	
		else if(nupp.equals("=")) {
            if(liitmine == 1) {
                int arvutus = Integer.parseInt(malu) + Integer.parseInt(paneel);
				malu = String.valueOf(arvutus);
				paneel = String.valueOf(arvutus);
				liitmine = 0;
            }
			else if(lahutamine == 1){
				int arvutus = Integer.parseInt(malu) - Integer.parseInt(paneel);
				malu = String.valueOf(arvutus);
				paneel=String.valueOf(arvutus);
				lahutamine = 0;
			}
			else if(korrutamine == 1){
				int arvutus = Integer.parseInt(malu) * Integer.parseInt(paneel);
				malu = String.valueOf(arvutus);
				paneel=String.valueOf(arvutus);
				korrutamine = 0;
			}
			else if(jagamine == 1){
				float arvutus = Integer.parseInt(malu) / Float.parseFloat(paneel);
				malu = String.valueOf(arvutus);
				paneel=String.valueOf(arvutus);
				jagamine = 0;
			}
			
			
		} else if(paneel.equals("0")) {
            paneel = nupp;	
		}	
		else{
			if (jargminenr == 1){
				paneel = sisestus;
				jargminenr = 0;
			}
			else{
			paneel += sisestus;
			}
		}
			
		
		
	}
	public String kuvatav(){
		return paneel;
	}
}
	
