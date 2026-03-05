int minOperations(char* s) {
    int count=0,n=strlen(s);
    for(int i=0;i<n;i++){
        count+=(s[i]^i)&1;
    }
    return count<(n-count) ? count: (n-count);
}