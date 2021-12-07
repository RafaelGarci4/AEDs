#include <stdio.h>


int main(){

    int anoImput = 0;
    int anoParam = 2062;
    scanf("%i",&anoImput);

    while (anoImput != 0)
    {
        while (anoParam <= anoImput)
        {
            anoParam = anoParam +76;
        }

        printf("%i\n", anoParam);
        scanf("%i",&anoImput);
        
    }
    

    


    return 0;
}