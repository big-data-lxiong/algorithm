package com.xl.string;

public class CountAndSay {

  public static void main(String[] args){
    System.out.println(countAndSay(6));
  }

  public static String countAndSay(int n) {
    StringBuffer str = new StringBuffer();
    str.append('1');

    for(int i = 2; i <= n; i++){
      char[] data = new String(str).toCharArray();
      str = new StringBuffer();
      int count = 1;
      int lastIndex = 0;
      char last = data[0];
      for(int j = 0; j < data.length; j++){
        if(data[j] != last){
          count = j - lastIndex;
          str.append(new Integer(count).toString()).append(last);
          last = data[j];
          lastIndex = j;
        }else{
            count = j - lastIndex + 1;
        }
      }
      str.append(new Integer(count).toString()).append(data[data.length - 1]);
    }
    return str.toString();
  }

}
