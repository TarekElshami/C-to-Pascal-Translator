int sum(int a, int b) {
    int result;
    int i;
    result = 0;

    for (i = a; i <= b; i = i + 2) {
        result = result + i;
    }
    return result;
}
