#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i;i<n;i++){
        scanf("%d",&arr[i]);
    }
    int tol;
    for(int i=0;i<n;i++){
        tol+=arr[i];
    }
    printf("%d",tol);
}
