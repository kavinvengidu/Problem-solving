#include <assert.h>
#include <ctype.h>
#include <limits.h>
#include <math.h>
#include <stdbool.h>
#include <stddef.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void plusMinus(int arr_count, int arr) {
    float plus=0.0,minus=0.0,zero=0.0;
    float count=arr_count;
    for (int i=0;i<arr_count;i++){
        if(arr[i]<0){
            minus+=1;
        }
        else if(arr[i]>0){
        plus+=1;
        }
        else{
            zero+=1;
        }
    }
    printf("%f\n",plus/count);
    printf("%f\n",minus/count);
    printf("%f",zero/count);

}
