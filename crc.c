#include <stdio.h>
#include <string.h>

void xorOperation(char *a, char *b, char *result, int n) {
    for (int i = 1; i < n; i++) {
        if (a[i] == b[i])
            result[i-1] = '0';
        else
            result[i-1] = '1';
    }
    result[n-1] = '\0';
}

// Modulo-2 Division
void mod2div(char *data, char *generator, char *remainder) {
    int pick = strlen(generator);
    char temp[100];

    strncpy(temp, data, pick);
    temp[pick] = '\0';

    while (pick < strlen(data)) {

        if (temp[0] == '1')
            xorOperation(generator, temp, temp, strlen(generator));
        else {
            char zeros[100];
            for (int i = 0; i < strlen(generator); i++)
                zeros[i] = '0';
            zeros[strlen(generator)] = '\0';

            xorOperation(zeros, temp, temp, strlen(generator));
        }

        int len = strlen(temp);
        for (int i = 0; i < len-1; i++)
            temp[i] = temp[i+1];

        temp[len-1] = data[pick];
        temp[len] = '\0';

        pick++;
    }

    if (temp[0] == '1')
        xorOperation(generator, temp, remainder, strlen(generator));
    else {
        char zeros[100];
        for (int i = 0; i < strlen(generator); i++)
            zeros[i] = '0';
        zeros[strlen(generator)] = '\0';

        xorOperation(zeros, temp, remainder, strlen(generator));
    }
}

int main() {

    char data[100], generator[100];
    char appendedData[100], remainder[100];
    char received[100];

    printf("Enter Data: ");
    scanf("%s", data);

    printf("Enter Generator: ");
    scanf("%s", generator);

    int r = strlen(generator) - 1;

    strcpy(appendedData, data);
    for (int i = 0; i < r; i++)
        strcat(appendedData, "0");

    mod2div(appendedData, generator, remainder);

    printf("\nCRC Remainder: %s", remainder);

    char transmitted[100];
    strcpy(transmitted, data);
    strcat(transmitted, remainder);

    printf("\nTransmitted Codeword: %s", transmitted);

    printf("\n\nEnter Received Data: ");
    scanf("%s", received);

    mod2div(received, generator, remainder);

    int error = 0;
    for (int i = 0; i < strlen(remainder); i++) {
        if (remainder[i] != '0') {
            error = 1;
            break;
        }
    }

    if (error)
        printf("\nError Detected ❌");
    else
        printf("\nNo Error Detected ✅");

    return 0;
}