 class Main_Menu {
    //Dicts for what is considered a valid digit, Letter, nonzerodigit
    //x = 1 allowed
    //x = 001 is not allowed
    //can't -0 that isn't valid

     //moved menu to another file to keep this just have the start
     //removed import statement since this will no longer need it.
    public static void main(String[] args) {
        Menu_Class mc = new Menu_Class();
        mc.welcomeMessage();
        mc.start();
    }
}
