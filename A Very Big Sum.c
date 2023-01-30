#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    long arr[n];
    for(int i=0;i<n;i++){
        scanf("%ld",&arr[i]);
    }
    long tol;
    for(int i=0;i<n;i++){
        tol+=arr[i];
    }
    printf("%ld",tol);
}
