int sum(int a, int b) {
    int result;
    int i;
    result = 0;

    for (i = a; i < b; i = i + 1) {
        result = result + i;
    }
    return result;
}
