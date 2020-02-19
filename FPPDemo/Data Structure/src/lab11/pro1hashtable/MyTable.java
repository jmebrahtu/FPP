package lab11.pro1hashtable;

import java.security.KeyStore.Entry;

public class MyTable {
	private Entry[] entries= new Entry[26];
	//private char key;
	//private String value;
	
	//returns the String that is matched with char c in the table
	public String get(char c){
		int index=(int)c-97;
		return entries[index].value;
		//implement
		
	}
	//adds to the table a pair (c, s) so that s can be looked up using c 
	public void add(char c, String s) {
		int hashcode=(int)c;
		int index= hashcode-97;
		Entry obj= new Entry(s,c);
		entries[index]=obj;


	}
	//returns a String consisting of nicely formatted display
	//of the contents of the table
	public String toString() {
		String result= "";
		for(int i=0;i<entries.length;i++)
			if(entries[i]!=null) {
			result+= entries[i].toString()+"\n";
			}
		return result;
	}
	
private class Entry{
	public  char key;
	public  String value;
 Entry(String str, char ch){
		this.key= ch;	
			this.value=str;
			//implement
		}
 public Entry(char c,String s) {
		//returns a String of the form "ch->str" 
 }
		public String toString() {
			return value+"->"+value;
		}
		
}
	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
		System.out.println(t);
		
		String s = t.get('b');
		System.out.println(s);
		
		
	}

}