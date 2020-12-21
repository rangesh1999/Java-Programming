package Accenture;

public class hipenalternate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x = "";
String a = "--hi--papa";
char arr[] = a.toCharArray();
int count=0;
for(int i=0;i<arr.length;i++)
{
	if(arr[i]=='-')
		count++;
	else
		x +=arr[i];
}
String finals ="";
while(count!=0)
{
	finals+='-';
	count--;
}
finals +=x;
System.out.println(finals);
	}

}
