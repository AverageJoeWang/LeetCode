/**
 * Created by wanglifei on 2018/1/5.
 */
public class LeetCode_541_ReverseStringII {
    public char[] reverse(char[] arr,int start,int end){
        char temp;
        int length=end-start;
        for(int i=0;i<length/2;i++){
            temp=arr[i+start];
            arr[i+start]=arr[end-1-i];
            arr[end-1-i]=temp;
        }
        return arr;
    }
    public String reverseStr(String s, int k) {
        char[] ch=s.toCharArray();
        int length=ch.length;
        int count=length;
        int flag=0;
        while(count>0){
            if(count<k){
                ch=reverse(ch,flag,length);
                break;
            }
            if(count>=k&&count<2*k){
                ch=reverse(ch,flag,flag+k);
                break;
            }
            if(count>=2*k){
                ch=reverse(ch,flag,flag+k);
                flag+=2*k;
                count=length-flag;
            }
        }
        return new String(ch);
    }
}
