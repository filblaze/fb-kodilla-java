package Zadania;

class MirrorString {

    public MirrorString() {
    }

    public void mirrorPrint(String input) {
        System.out.println(input);
        char[] tabelka = input.toCharArray();
        for (int i = tabelka.length - 1; i >= 0; i--) {
            System.out.print(tabelka[i]);
        }
    }
}
