class GfG
 {
	String encode(String str)
	{
          //Your code here
          int count = 1;
          int n = str.length();
          String res = ""+str.charAt(0);
          for(int i=1; i<n; i++){
              if(str.charAt(i-1)==str.charAt(i)) count++;
              else {
                  res += String.valueOf(count);
                  res += str.charAt(i);
                  count = 1;
              }    
          }
          return res+String.valueOf(count);
          
	}
 }
