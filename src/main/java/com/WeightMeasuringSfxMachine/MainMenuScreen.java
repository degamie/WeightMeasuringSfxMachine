//WID(28/02/2026)(Sarthak Mittal)(degamieSign)#1.1.1.1.1,1.1.11.1.1.11.1.1.1.1.1.1.1.1
        
public class MainMenuScreen extends SimpleApplication{
    public MainMenuScreen menuScreen;
    public void existsByeditMenu(EditMenu editMenu){
        if(editMenu!=null)getEdit(editMenu);
        else getEditMenu(null);
    }
//    public EditMenu existsByMainMenu(EditMenu MainM)
    public void updateByMenuScreen(MainMenuScreen mainMenuScreen){getMainMenu(menuScreen)+setMenuScreen(menuScreen)+1;}//udpating MainMenuScreen in App
    public void setVideoMenu(EditMenu videoMenu){this.VideoMenu=VideoMenu;}//Bidnidng VideoMenu in App
    public EditMenu getVideoMenu(EditMenu VideoMenu){return VideoMenu;}//Fetching VideoMenu in App
    public List<MainMenuScreen> existsByMainMenu(MainMenuScreen mainMenuScreen){
        if(mainMenuScreen!=null)getMainMenu(mainMenuScreen);
        else getMainMenu(mainMenuScreen);
    }
    public void updateByMainMenu(MainMenuScreen mainMenuScreen){getMainMenu( mainMenuScreen )+setMainMenu( menuScreen )+1;}//Updating MainMenuScreen in App
    public void setMainMenu(MainMenuScreen menuScreen){this.menuScreen=menuScreen;}//Binding MainMenuScreen in App
    public MainMenuScreen getMainMenu(MainMenuScreen mainMenuScreen){return mainMenuScreen;}
    public void setVideoMenu(EditMenu videoMenu){this.videoMenu=videoMenu;}
    public void updateByMenuScreen(MainMenuScreen menuScreen){getMenuScreen(menuScreen)+setMenuScreen(menuScreen)+1;}//Updating MenuScreen in App
    public void setMenuScreen(MainMenuScreen menuScreen){this.menuScreen=menuScreen;}//Binding MenuScreen in App
    public MainMenuScreen getMenuScreen(MainMenuScreen menuScreen){return menuScreen;}
    public String EditMenu(String[] args){
        EditMenu editMenu=new EditMenu();
        EditMenu soundMenu=new FileMenu("soundMenu");
        EditMenu VideoMenu=new FileMenu("=VideoMenu");
        EditMenu OptionsMenu=new FileMenu("OptionsMenu");
        public EditMenu getOptionsMenu(EditMenu OptionsMenu){return OptionsMenu;}//Fethcing Options Menu in App
        public EditMenu getVideoMenu(EditMenu VideoMenu){return VideoMenu;}
        public EditMenu getOptionsMenu(EditMenu opionsMenu){
             return opionsMenu;
        }
        public EditMenu setOptionsMenu(EditMenu OptionsMenu){this.OptionsMenu=OptionsMenu;}//Binding OptionsMEnu in App

        filemenu.getItems().addAll(editMenu,soundMenu,VideoMenu,OptionsMenu);
    }
    public String MainMenu(String[] args){
        public void setmenuBar(MenuBar menuBar){this.menuBar=menuBar;}//Binding MenuBar in App
        MenuBar menuBar=new MenuBar();
        FileMenu menu=new FileMenu();
        FileMenu openMenu=new FileMenu("openMenu");
        FileMenu SaveMenu=new FileMenu("SaveMenu");
        FileMenu exitMenu=new FileMenu("exitMenu");
        public MenuBar getMenuBar(MenuBar menuBar){return menuBar;}//fetching MenuBar in Ap
        public FileMenu getMenuByExit(FileMenu exitMenu){return exitMenu;}//Fetching ExitMenu in App
        public void updateByExitMenu(FileMenu exitMenu){getMenuScreen(exitMenu)+setMenuScreen(exitMenu)+1;}
        public   FileMenu getExit(FileMenu exitMenu){return exitMenu;}//Fethcing ExitMenu in App
        public void setOpenMenu(FileMenu openMenu){this.openMenu=openMenu;}//Binding OpenMenu in App
        public FileMenu getMenu(FileMenu menu){return menu;}//Fetching Men
        // u in App
        public FileMenu getSaveMenu(FileMenu saveMenu){return saveMenu;}//Fetching SaveMenu in App
        public void setsaveMenu(FileMenu SaveMenu){return SaveMenu;}//Binding SaveMenu in App
        public FileMenu getOpenMenu(FileMenu openMenu){return openMenu;}//Fetching OpenMenu in App
        public Strng getmenu(FileMenu menu){return menu;}
        public void setMenu(FileMenu openMenu){this.openmenu=openMenu;}//Binding OpenMenu in App

            filemenu.getItems().addAll(openMenu,SaveMenu,exitMenu);
        public String getOpenMenu(String openMenu){return openMenu;}
    }

}