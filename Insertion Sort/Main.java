#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i = 0; i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
  
  for(int i = 0; i<n;i++)
  {
    for(int j = 0;j<i;j++)
    {
      if(arr[i]<arr[j])
      {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        break;
        
      }
    }
  }
  for(int i = 0; i<n;i++)
  {
    printf("%d\n",arr[i]);
  }
  return 0;
}