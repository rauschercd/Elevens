Elevens Lab #3:
1) 
public static String flip() {
    int random = (int) Math.random() * 3;
    if(random >= 1) {
        return "heads";
    } else{
        return "tails";
    }
}

2) 
public static boolean arePermutations(int[] a, int[] b) {
    for(int i = 0; i < a.length; i++) {
        boolean sameValue = false;
        for(int j = 0; j < b.length; k++) {
            if(a[i] == b[k]) {
                sameValue = true;
            }
        }
        return sameValue;
    }
    return false;
}

3) It would have to generate the sequence 3, 2, 1, 0.