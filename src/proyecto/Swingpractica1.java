/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;


import javax.swing.JButton;

import java.util.Random;
import javax.swing.ImageIcon;

public class Swingpractica1 extends javax.swing.JFrame {

    JButton tableroBotones[][] = new JButton[10][10];
    Ficha fichas[][] = new Ficha[10][10];
    Random random = new Random();
    private Ficha heroes[] = new Ficha[40];
    private Ficha villanos[] = new Ficha[40];
   
    
String beast             = "BEAST.png";
String blackWidow        = "BLACKWIDOW.png";
String blade             = "BLADE.png";
String captainAmerica    = "CAPTAINAMERICA.png";
String punisher          = "PUNISHER.png";
String colossus          = "COLOSSUS.png";
String cyclops           = "CYCLOPS.png";
String daredevil         = "DAREDEVIL.png";
String drStrange         = "DRSTRANGE.png";
String thing             = "THING.png";
String emmaFrost         = "EMMAFROST.png";
String ghostRider        = "GHOSTRIDER.png";
String giantMan          = "GIANTMAN.png";
String hulk              = "HULK.png";
String humanTorch        = "HUMANTORCH.png";
String iceMan            = "ICEMAN.png";
String invisibleWoman    = "INVISIBLEWOMAN.png";
String ironMan           = "IRONMAN.png";
String nightcrawler      = "NIGHTCRAWLER.png";
String mrFantastic       = "MRFANTASTIC.png";
String namor             = "NAMOR.png";
String nickFury          = "NICKFURY.png";
String phoenix           = "PHOENIX.png";
String proffesorX        = "PROFFESORX.png";
String sheHulk           = "SHEHULK.png";
String silverSurfer      = "SILVERSURFER.png";
String spiderGirl        = "SPIDERGIRL.png";
String spiderMan         = "SPIDERMAN.png";
String storm             = "STORM.png";
String thor              = "THOR.png";
String wolverine         = "WOLVERINE.png";
String elektra           = "ELEKTRA.png";
String gambit            = "GAMBIT.png";
String novaBlast         = "NOVABLAST.png";
String planetaTierra     = "PLANETATIERRA.png";
String drDoom            = "DRDOOM.png";
String galactus          = "GALACTUS.png";
String kingpin           = "KINGPIN.png";
String magneto           = "MAGNETO.png";
String apocalypse        = "APOCALYPSE.png";
String greenGoblin       = "GREENGOBLIN.png";
String venom             = "VENOM.png";
String bullseye          = "BULLSEYE.png";
String omegaRed          = "OMEGARED.png";
String onslaught         = "ONSLAUGHT.png";
String redSkull          = "REDSKULL.png";
String mystyque          = "MYSTYQUE.png";
String mysterio          = "MYSTERIO.png";
String drOctopus         = "DR.OCTOPUS.png";
String deadpool          = "DEADPOOL.png";
String abomination       = "ABOMINATION2.png";
String thanos            = "THANOS.png";
String blackcat          = "BLACKCAT.png";
String sabretooth        = "SABRETOOTH.png";
String juggernaut        = "JUGGERNAUT.png";
String rhino             = "RHINO.png";
String carnage           = "CARNAGE.png";
String moleMan           = "MOLEMAN.png";
String lizard            = "LIZARD.png";
String mrSinister        = "MRSINISTER.png";
String sentinel1         = "SENTINEL1.png";
String ultron            = "ULTRON.png";
String sandman           = "SANDMAN.png";
String leader            = "LEADER.png";
String viper             = "VIPER.png";
String sentinel2         = "SENTINEL2.png";
String electro           = "ELECTRO.png";
String blackWidowVillana = "BlackWidowvillana.png";
String pumpkinBomb1      = "PUMPKINBOMB.png";
String tierraVillanos    = "TIERRAVILLANOS.png";

    
            
    public Swingpractica1() {

        initComponents();

        tableroBotones[0][0] = b1;
        tableroBotones[0][1] = b2;
        tableroBotones[0][2] = b3;
        tableroBotones[0][3] = b4;
        tableroBotones[0][4] = b5;
        tableroBotones[0][5] = b6;
        tableroBotones[0][6] = b7;
        tableroBotones[0][7] = b8;
        tableroBotones[0][8] = b9;
        tableroBotones[0][9] = b10;
        tableroBotones[1][0] = b11;
        tableroBotones[1][1] = b12;
        tableroBotones[1][2] = b13;
        tableroBotones[1][3] = b14;
        tableroBotones[1][4] = b15;
        tableroBotones[1][5] = b16;
        tableroBotones[1][6] = b17;
        tableroBotones[1][7] = b18;
        tableroBotones[1][8] = b19;
        tableroBotones[1][9] = b20;
        tableroBotones[2][0] = b21;
        tableroBotones[2][1] = b22;
        tableroBotones[2][2] = b23;
        tableroBotones[2][3] = b24;
        tableroBotones[2][4] = b25;
        tableroBotones[2][5] = b26;
        tableroBotones[2][6] = b27;
        tableroBotones[2][7] = b28;
        tableroBotones[2][8] = b29;
        tableroBotones[2][9] = b30;
        tableroBotones[3][0] = b31;
        tableroBotones[3][1] = b32;
        tableroBotones[3][2] = b33;
        tableroBotones[3][3] = b34;
        tableroBotones[3][4] = b35;
        tableroBotones[3][5] = b36;
        tableroBotones[3][6] = b37;
        tableroBotones[3][7] = b38;
        tableroBotones[3][8] = b39;
        tableroBotones[3][9] = b40;
        tableroBotones[4][0] = b41;
        tableroBotones[4][1] = b42;
        tableroBotones[4][2] = b43;
        tableroBotones[4][3] = b44;
        tableroBotones[4][4] = b45;
        tableroBotones[4][5] = b46;
        tableroBotones[4][6] = b47;
        tableroBotones[4][7] = b48;
        tableroBotones[4][8] = b49;
        tableroBotones[4][9] = b50;
        tableroBotones[5][0] = b51;
        tableroBotones[5][1] = b52;
        tableroBotones[5][2] = b53;
        tableroBotones[5][3] = b54;
        tableroBotones[5][4] = b55;
        tableroBotones[5][5] = b56;
        tableroBotones[5][6] = b57;
        tableroBotones[5][7] = b58;
        tableroBotones[5][8] = b59;
        tableroBotones[5][9] = b60;
        tableroBotones[6][0] = b61;
        tableroBotones[6][1] = b62;
        tableroBotones[6][2] = b63;
        tableroBotones[6][3] = b64;
        tableroBotones[6][4] = b65;
        tableroBotones[6][5] = b66;
        tableroBotones[6][6] = b67;
        tableroBotones[6][7] = b68;
        tableroBotones[6][8] = b69;
        tableroBotones[6][9] = b70;
        tableroBotones[7][0] = b71;
        tableroBotones[7][1] = b72;
        tableroBotones[7][2] = b73;
        tableroBotones[7][3] = b74;
        tableroBotones[7][4] = b75;
        tableroBotones[7][5] = b76;
        tableroBotones[7][6] = b77;
        tableroBotones[7][7] = b78;
        tableroBotones[7][8] = b79;
        tableroBotones[7][9] = b80;
        tableroBotones[8][0] = b81;
        tableroBotones[8][1] = b82;
        tableroBotones[8][2] = b83;
        tableroBotones[8][3] = b84;
        tableroBotones[8][4] = b85;
        tableroBotones[8][5] = b86;
        tableroBotones[8][6] = b87;
        tableroBotones[8][7] = b88;
        tableroBotones[8][8] = b89;
        tableroBotones[8][9] = b90;
        tableroBotones[9][0] = b91;
        tableroBotones[9][1] = b92;
        tableroBotones[9][2] = b93;
        tableroBotones[9][3] = b94;
        tableroBotones[9][4] = b95;
        tableroBotones[9][5] = b96;
        tableroBotones[9][6] = b97;
        tableroBotones[9][7] = b98;
        tableroBotones[9][8] = b99;
        tableroBotones[9][9] = b100;

        ValorFichas();
        PosicionesRandom(heroes, 0);
        PosicionesRandom(villanos, 6);

    }

    
        
private void ValorFichas() {
   

    heroes[0]  = new Ficha("Beast",            new ImageIcon(getClass().getResource(beast)),           "heroe", 3);
    heroes[1]  = new Ficha("Black Widow",      new ImageIcon(getClass().getResource(blackWidow)),      "heroe", 3);
    heroes[2]  = new Ficha("Blade",            new ImageIcon(getClass().getResource(blade)),           "heroe", 3);
    heroes[3]  = new Ficha("Captain America",  new ImageIcon(getClass().getResource(captainAmerica)),  "heroe", 3);
    heroes[4]  = new Ficha("Punisher",         new ImageIcon(getClass().getResource(punisher)),         "heroe", 3);
    heroes[5]  = new Ficha("Colossus",         new ImageIcon(getClass().getResource(colossus)),         "heroe", 3);
    heroes[6]  = new Ficha("Cyclops",          new ImageIcon(getClass().getResource(cyclops)),          "heroe", 3);
    heroes[7]  = new Ficha("Daredevil",        new ImageIcon(getClass().getResource(daredevil)),        "heroe", 3);
    heroes[8]  = new Ficha("Dr Strange",       new ImageIcon(getClass().getResource(drStrange)),        "heroe", 3);
    heroes[9]  = new Ficha("Thing",            new ImageIcon(getClass().getResource(thing)),            "heroe", 3);
    heroes[10] = new Ficha("Emma Frost",       new ImageIcon(getClass().getResource(emmaFrost)),        "heroe", 3);
    heroes[11] = new Ficha("Ghost Rider",      new ImageIcon(getClass().getResource(ghostRider)),       "heroe", 3);
    heroes[12] = new Ficha("Giant Man",        new ImageIcon(getClass().getResource(giantMan)),         "heroe", 3);
    heroes[13] = new Ficha("Hulk",             new ImageIcon(getClass().getResource(hulk)),             "heroe", 3);
    heroes[14] = new Ficha("Human Torch",      new ImageIcon(getClass().getResource(humanTorch)),       "heroe", 3);
    heroes[15] = new Ficha("Ice Man",          new ImageIcon(getClass().getResource(iceMan)),           "heroe", 3);
    heroes[16] = new Ficha("Invisible Woman",  new ImageIcon(getClass().getResource(invisibleWoman)),   "heroe", 3);
    heroes[17] = new Ficha("Iron Man",         new ImageIcon(getClass().getResource(ironMan)),          "heroe", 3);
    heroes[18] = new Ficha("Nightcrawler",     new ImageIcon(getClass().getResource(nightcrawler)),     "heroe", 3);
    heroes[19] = new Ficha("Mr Fantastic",     new ImageIcon(getClass().getResource(mrFantastic)),      "heroe", 3);
    heroes[20] = new Ficha("Namor",            new ImageIcon(getClass().getResource(namor)),            "heroe", 3);
    heroes[21] = new Ficha("Nick Fury",        new ImageIcon(getClass().getResource(nickFury)),         "heroe", 3);
    heroes[22] = new Ficha("Phoenix",          new ImageIcon(getClass().getResource(phoenix)),          "heroe", 3);
    heroes[23] = new Ficha("Proffesor X",      new ImageIcon(getClass().getResource(proffesorX)),       "heroe", 3);
    heroes[24] = new Ficha("She-Hulk",         new ImageIcon(getClass().getResource(sheHulk)),          "heroe", 3);
    heroes[25] = new Ficha("Silver Surfer",    new ImageIcon(getClass().getResource(silverSurfer)),     "heroe", 3);
    heroes[26] = new Ficha("Spider Girl",      new ImageIcon(getClass().getResource(spiderGirl)),       "heroe", 3);
    heroes[27] = new Ficha("Spider Man",       new ImageIcon(getClass().getResource(spiderMan)),        "heroe", 3);
    heroes[28] = new Ficha("Storm",            new ImageIcon(getClass().getResource(storm)),            "heroe", 3);
    heroes[29] = new Ficha("Thor",             new ImageIcon(getClass().getResource(thor)),             "heroe", 3);
    heroes[30] = new Ficha("Wolverine",        new ImageIcon(getClass().getResource(wolverine)),        "heroe", 3);
    heroes[31] = new Ficha("Elektra",          new ImageIcon(getClass().getResource(elektra)),          "heroe", 3);
    heroes[32] = new Ficha("Gambit",           new ImageIcon(getClass().getResource(gambit)),           "heroe", 3);
    heroes[33] = new Ficha("Nova Blast",       new ImageIcon(getClass().getResource(novaBlast)),        "heroe", 3);
    heroes[34] = new Ficha("Nova Blast",       new ImageIcon(getClass().getResource(novaBlast)),        "heroe", 3);
    heroes[35] = new Ficha("Nova Blast",       new ImageIcon(getClass().getResource(novaBlast)),        "heroe", 3);
    heroes[36] = new Ficha("Nova Blast",       new ImageIcon(getClass().getResource(novaBlast)),        "heroe", 3);
    heroes[37] = new Ficha("Nova Blast",       new ImageIcon(getClass().getResource(novaBlast)),        "heroe", 3);
    heroes[38] = new Ficha("Nova Blast",       new ImageIcon(getClass().getResource(novaBlast)),        "heroe", 3);
    heroes[39] = new Ficha("Planeta Tierra",   new ImageIcon(getClass().getResource(planetaTierra)),    "heroe", 3);

    // Villanos
    villanos[0]  = new Ficha("Dr Doom",         new ImageIcon(getClass().getResource(drDoom)),           "Villano", 3);
    villanos[1]  = new Ficha("Galactus",        new ImageIcon(getClass().getResource(galactus)),         "Villano", 3);
    villanos[2]  = new Ficha("Kingpin",         new ImageIcon(getClass().getResource(kingpin)),          "Villano", 3);
    villanos[3]  = new Ficha("Magneto",         new ImageIcon(getClass().getResource(magneto)),          "Villano", 3);
    villanos[4]  = new Ficha("Apocalypse",      new ImageIcon(getClass().getResource(apocalypse)),       "Villano", 3);
    villanos[5]  = new Ficha("Green Goblin",    new ImageIcon(getClass().getResource(greenGoblin)),      "Villano", 3);
    villanos[6]  = new Ficha("Venom",           new ImageIcon(getClass().getResource(venom)),            "Villano", 3);
    villanos[7]  = new Ficha("Bullseye",        new ImageIcon(getClass().getResource(bullseye)),         "Villano", 3);
    villanos[8]  = new Ficha("Omega Red",       new ImageIcon(getClass().getResource(omegaRed)),         "Villano", 3);
    villanos[9]  = new Ficha("Onslaught",       new ImageIcon(getClass().getResource(onslaught)),        "Villano", 3);
    villanos[10] = new Ficha("Red Skull",       new ImageIcon(getClass().getResource(redSkull)),         "Villano", 3);
    villanos[11] = new Ficha("Mystique",        new ImageIcon(getClass().getResource(mystyque)),         "Villano", 3);
    villanos[12] = new Ficha("Mysterio",        new ImageIcon(getClass().getResource(mysterio)),         "Villano", 3);
    villanos[13] = new Ficha("Dr Octopus",      new ImageIcon(getClass().getResource(drOctopus)),        "Villano", 3);
    villanos[14] = new Ficha("Deadpool",        new ImageIcon(getClass().getResource(deadpool)),         "Villano", 3);
    villanos[15] = new Ficha("Abomination",     new ImageIcon(getClass().getResource(abomination)),      "Villano", 3);
    villanos[16] = new Ficha("Thanos",          new ImageIcon(getClass().getResource(thanos)),           "Villano", 3);
    villanos[17] = new Ficha("Black Cat",       new ImageIcon(getClass().getResource(blackcat)),         "Villano", 3);
    villanos[18] = new Ficha("Sabretooth",      new ImageIcon(getClass().getResource(sabretooth)),       "Villano", 3);
    villanos[19] = new Ficha("Juggernaut",      new ImageIcon(getClass().getResource(juggernaut)),       "Villano", 3);
    villanos[20] = new Ficha("Rhino",           new ImageIcon(getClass().getResource(rhino)),            "Villano", 3);
    villanos[21] = new Ficha("Carnage",         new ImageIcon(getClass().getResource(carnage)),          "Villano", 3);
    villanos[22] = new Ficha("Mole Man",        new ImageIcon(getClass().getResource(moleMan)),          "Villano", 3);
    villanos[23] = new Ficha("Lizard",          new ImageIcon(getClass().getResource(lizard)),           "Villano", 3);
    villanos[24] = new Ficha("Mr.Sinister",     new ImageIcon(getClass().getResource(mrSinister)),       "Villano", 3);
    villanos[25] = new Ficha("Sentinel 1",      new ImageIcon(getClass().getResource(sentinel1)),        "Villano", 3);
    villanos[26] = new Ficha("Ultron",          new ImageIcon(getClass().getResource(ultron)),           "Villano", 3);
    villanos[27] = new Ficha("Sandman",         new ImageIcon(getClass().getResource(sandman)),          "Villano", 3);
    villanos[28] = new Ficha("Leader",          new ImageIcon(getClass().getResource(leader)),           "Villano", 3);
    villanos[29] = new Ficha("Viper",           new ImageIcon(getClass().getResource(viper)),            "Villano", 3);
    villanos[30] = new Ficha("Sentinel 2",      new ImageIcon(getClass().getResource(sentinel2)),        "Villano", 3);
    villanos[31] = new Ficha("Electro",         new ImageIcon(getClass().getResource(electro)),          "Villano", 3);
    villanos[32] = new Ficha("Black Widow",     new ImageIcon(getClass().getResource(blackWidowVillana)),"Villano", 3);
    villanos[33] = new Ficha("Pumpkin Bomb",    new ImageIcon(getClass().getResource(pumpkinBomb1)),     "Villano", 3);
    villanos[34] = new Ficha("Pumpkin Bomb",    new ImageIcon(getClass().getResource(pumpkinBomb1)),     "Villano", 3);
    villanos[35] = new Ficha("Pumpkin Bomb",    new ImageIcon(getClass().getResource(pumpkinBomb1)),     "Villano", 3);
    villanos[36] = new Ficha("Pumpkin Bomb",    new ImageIcon(getClass().getResource(pumpkinBomb1)),     "Villano", 3);
    villanos[37] = new Ficha("Pumpkin Bomb",    new ImageIcon(getClass().getResource(pumpkinBomb1)),     "Villano", 3);
    villanos[38] = new Ficha("Pumpkin Bomb",    new ImageIcon(getClass().getResource(pumpkinBomb1)),     "Villano", 3);
    villanos[39] = new Ficha("Tierra Villanos", new ImageIcon(getClass().getResource(tierraVillanos)),   "Villano", 3);
}


    

    private void PosicionesRandom(Ficha[] grupo, int primerafila) {

        int[] posiciones = new int[40];
        for (int i = 0; i < posiciones.length; i++) {
            posiciones[i] = i;
        }

        for (int i = posiciones.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            int guardar = posiciones[i];
            posiciones[i] = posiciones[j];
            posiciones[j] = guardar;
        }

        for (int i = 0; i < grupo.length; i++) {
            int p = posiciones[i];
            int fila = primerafila + (p / 10);
            int col = p % 10;
            
                   
            tableroBotones[fila][col].setIcon(grupo[i].getIcono());
            fichas[fila][col] = grupo[i];
        }
    }

    private void posicion(JButton objetivo) {
        for (int i = 0; i < tableroBotones.length; i++) {
            for (int j = 0; j < tableroBotones.length; j++) {
                if (tableroBotones[i][j] == objetivo) {
                    System.out.println("boton esta en fila: " + i + " Columna " + j);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        b93 = new javax.swing.JButton();
        b95 = new javax.swing.JButton();
        b94 = new javax.swing.JButton();
        b96 = new javax.swing.JButton();
        b91 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b50 = new javax.swing.JButton();
        b49 = new javax.swing.JButton();
        b48 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b51 = new javax.swing.JButton();
        b52 = new javax.swing.JButton();
        b53 = new javax.swing.JButton();
        b54 = new javax.swing.JButton();
        b55 = new javax.swing.JButton();
        b56 = new javax.swing.JButton();
        b57 = new javax.swing.JButton();
        b58 = new javax.swing.JButton();
        b59 = new javax.swing.JButton();
        b60 = new javax.swing.JButton();
        b61 = new javax.swing.JButton();
        b62 = new javax.swing.JButton();
        b63 = new javax.swing.JButton();
        b64 = new javax.swing.JButton();
        b65 = new javax.swing.JButton();
        b66 = new javax.swing.JButton();
        b67 = new javax.swing.JButton();
        b68 = new javax.swing.JButton();
        b69 = new javax.swing.JButton();
        b70 = new javax.swing.JButton();
        b71 = new javax.swing.JButton();
        b72 = new javax.swing.JButton();
        b73 = new javax.swing.JButton();
        b74 = new javax.swing.JButton();
        b75 = new javax.swing.JButton();
        b76 = new javax.swing.JButton();
        b77 = new javax.swing.JButton();
        b78 = new javax.swing.JButton();
        b79 = new javax.swing.JButton();
        b80 = new javax.swing.JButton();
        b97 = new javax.swing.JButton();
        b98 = new javax.swing.JButton();
        b99 = new javax.swing.JButton();
        b100 = new javax.swing.JButton();
        b81 = new javax.swing.JButton();
        b82 = new javax.swing.JButton();
        b83 = new javax.swing.JButton();
        b84 = new javax.swing.JButton();
        b85 = new javax.swing.JButton();
        b86 = new javax.swing.JButton();
        b87 = new javax.swing.JButton();
        b88 = new javax.swing.JButton();
        b89 = new javax.swing.JButton();
        b92 = new javax.swing.JButton();
        b90 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b93.setPreferredSize(new java.awt.Dimension(50, 23));
        b93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b93ActionPerformed(evt);
            }
        });
        getContentPane().add(b93, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 77, 40, 38));

        b95.setPreferredSize(new java.awt.Dimension(50, 23));
        b95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b95ActionPerformed(evt);
            }
        });
        getContentPane().add(b95, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 77, 40, 38));

        b94.setPreferredSize(new java.awt.Dimension(50, 23));
        b94.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                b94ComponentAdded(evt);
            }
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                b94ComponentRemoved(evt);
            }
        });
        b94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b94ActionPerformed(evt);
            }
        });
        getContentPane().add(b94, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 77, 40, 38));

        b96.setPreferredSize(new java.awt.Dimension(50, 23));
        b96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b96ActionPerformed(evt);
            }
        });
        getContentPane().add(b96, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 77, 40, 38));

        b91.setPreferredSize(new java.awt.Dimension(50, 23));
        b91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b91ActionPerformed(evt);
            }
        });
        getContentPane().add(b91, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 40, 40));

        b10.setText("jButton101");
        b10.setPreferredSize(new java.awt.Dimension(50, 23));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 40, 38));

        b9.setText("jButton101");
        b9.setPreferredSize(new java.awt.Dimension(50, 23));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 40, 38));

        b8.setText("jButton101");
        b8.setPreferredSize(new java.awt.Dimension(50, 23));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 42, 38));

        b7.setText("jButton101");
        b7.setPreferredSize(new java.awt.Dimension(50, 23));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 460, 42, 38));

        b6.setText("jButton101");
        b6.setPreferredSize(new java.awt.Dimension(50, 23));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 42, 38));

        b5.setText("jButton101");
        b5.setPreferredSize(new java.awt.Dimension(50, 23));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 42, 38));

        b4.setText("jButton101");
        b4.setPreferredSize(new java.awt.Dimension(50, 23));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 42, 38));

        b3.setText("jButton101");
        b3.setPreferredSize(new java.awt.Dimension(50, 23));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 42, 38));

        b2.setText("jButton101");
        b2.setPreferredSize(new java.awt.Dimension(50, 23));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 42, 38));

        b1.setPreferredSize(new java.awt.Dimension(50, 23));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 40, 40));

        b20.setText("jButton101");
        b20.setPreferredSize(new java.awt.Dimension(50, 23));
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        getContentPane().add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 410, 42, 38));

        b19.setText("jButton101");
        b19.setPreferredSize(new java.awt.Dimension(50, 23));
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        getContentPane().add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 42, 38));

        b18.setText("jButton101");
        b18.setPreferredSize(new java.awt.Dimension(50, 23));
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        getContentPane().add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, 42, 38));

        b17.setText("jButton101");
        b17.setPreferredSize(new java.awt.Dimension(50, 23));
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        getContentPane().add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 42, 38));

        b16.setText("jButton101");
        b16.setPreferredSize(new java.awt.Dimension(50, 23));
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 42, 38));

        b15.setText("jButton101");
        b15.setPreferredSize(new java.awt.Dimension(50, 23));
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 42, 38));

        b14.setText("jButton101");
        b14.setPreferredSize(new java.awt.Dimension(50, 23));
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 42, 40));

        b13.setText("jButton101");
        b13.setPreferredSize(new java.awt.Dimension(50, 23));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 42, 38));

        b12.setText("jButton101");
        b12.setPreferredSize(new java.awt.Dimension(50, 23));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 40, 40));

        b11.setText("jButton101");
        b11.setPreferredSize(new java.awt.Dimension(50, 23));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 42, 38));

        b30.setText("jButton101");
        b30.setPreferredSize(new java.awt.Dimension(50, 23));
        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        getContentPane().add(b30, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 42, 38));

        b29.setText("jButton101");
        b29.setPreferredSize(new java.awt.Dimension(50, 23));
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        getContentPane().add(b29, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 42, 38));

        b28.setText("jButton101");
        b28.setPreferredSize(new java.awt.Dimension(50, 23));
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        getContentPane().add(b28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 42, 38));

        b27.setText("jButton101");
        b27.setPreferredSize(new java.awt.Dimension(50, 23));
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        getContentPane().add(b27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 42, 38));

        b26.setText("jButton101");
        b26.setPreferredSize(new java.awt.Dimension(50, 23));
        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        getContentPane().add(b26, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 42, 38));

        b25.setText("jButton101");
        b25.setPreferredSize(new java.awt.Dimension(50, 23));
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        getContentPane().add(b25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 42, 38));

        b24.setText("jButton101");
        b24.setPreferredSize(new java.awt.Dimension(50, 23));
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        getContentPane().add(b24, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 42, 38));

        b23.setText("jButton101");
        b23.setPreferredSize(new java.awt.Dimension(50, 23));
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        getContentPane().add(b23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, 42, 38));

        b22.setText("jButton101");
        b22.setPreferredSize(new java.awt.Dimension(50, 23));
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        getContentPane().add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, 42, 38));

        b21.setText("jButton101");
        b21.setPreferredSize(new java.awt.Dimension(50, 23));
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        getContentPane().add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 42, 38));

        b40.setText("jButton101");
        b40.setPreferredSize(new java.awt.Dimension(50, 23));
        b40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b40ActionPerformed(evt);
            }
        });
        getContentPane().add(b40, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 330, 42, 38));

        b39.setText("jButton101");
        b39.setPreferredSize(new java.awt.Dimension(50, 23));
        b39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b39ActionPerformed(evt);
            }
        });
        getContentPane().add(b39, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 42, 38));

        b38.setText("jButton101");
        b38.setPreferredSize(new java.awt.Dimension(50, 23));
        b38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b38ActionPerformed(evt);
            }
        });
        getContentPane().add(b38, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 42, 38));

        b37.setText("jButton101");
        b37.setPreferredSize(new java.awt.Dimension(50, 23));
        b37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b37ActionPerformed(evt);
            }
        });
        getContentPane().add(b37, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, 42, 38));

        b36.setText("jButton101");
        b36.setPreferredSize(new java.awt.Dimension(50, 23));
        b36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b36ActionPerformed(evt);
            }
        });
        getContentPane().add(b36, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 42, 38));

        b35.setText("jButton101");
        b35.setPreferredSize(new java.awt.Dimension(50, 23));
        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        getContentPane().add(b35, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 42, 38));

        b34.setText("jButton101");
        b34.setPreferredSize(new java.awt.Dimension(50, 23));
        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        getContentPane().add(b34, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 42, 38));

        b33.setText("jButton101");
        b33.setPreferredSize(new java.awt.Dimension(50, 23));
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        getContentPane().add(b33, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 42, 38));

        b32.setText("jButton101");
        b32.setPreferredSize(new java.awt.Dimension(50, 23));
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        getContentPane().add(b32, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 42, 38));

        b31.setText("jButton101");
        b31.setPreferredSize(new java.awt.Dimension(50, 23));
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        getContentPane().add(b31, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 42, 38));

        b50.setText("jButton101");
        b50.setPreferredSize(new java.awt.Dimension(50, 23));
        b50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b50ActionPerformed(evt);
            }
        });
        getContentPane().add(b50, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 42, 38));

        b49.setText("jButton101");
        b49.setPreferredSize(new java.awt.Dimension(50, 23));
        b49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b49ActionPerformed(evt);
            }
        });
        getContentPane().add(b49, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 42, 38));

        b48.setText("jButton101");
        b48.setPreferredSize(new java.awt.Dimension(50, 23));
        b48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b48ActionPerformed(evt);
            }
        });
        getContentPane().add(b48, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 42, 38));

        b47.setText("jButton101");
        b47.setPreferredSize(new java.awt.Dimension(50, 23));
        b47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b47ActionPerformed(evt);
            }
        });
        getContentPane().add(b47, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 42, 38));

        b46.setText("jButton101");
        b46.setPreferredSize(new java.awt.Dimension(50, 23));
        b46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b46ActionPerformed(evt);
            }
        });
        getContentPane().add(b46, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 42, 38));

        b45.setText("jButton101");
        b45.setPreferredSize(new java.awt.Dimension(50, 23));
        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b45ActionPerformed(evt);
            }
        });
        getContentPane().add(b45, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 42, 38));

        b44.setText("jButton101");
        b44.setPreferredSize(new java.awt.Dimension(50, 23));
        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b44ActionPerformed(evt);
            }
        });
        getContentPane().add(b44, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 42, 38));

        b43.setText("jButton101");
        b43.setPreferredSize(new java.awt.Dimension(50, 23));
        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        getContentPane().add(b43, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 42, 38));

        b42.setText("jButton101");
        b42.setPreferredSize(new java.awt.Dimension(50, 23));
        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        getContentPane().add(b42, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 42, 38));

        b41.setText("jButton101");
        b41.setPreferredSize(new java.awt.Dimension(50, 23));
        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b41ActionPerformed(evt);
            }
        });
        getContentPane().add(b41, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 42, 38));

        b51.setText("jButton101");
        b51.setPreferredSize(new java.awt.Dimension(50, 23));
        b51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b51ActionPerformed(evt);
            }
        });
        getContentPane().add(b51, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 42, 38));

        b52.setText("jButton101");
        b52.setPreferredSize(new java.awt.Dimension(50, 23));
        b52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b52ActionPerformed(evt);
            }
        });
        getContentPane().add(b52, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 42, 38));

        b53.setText("jButton101");
        b53.setPreferredSize(new java.awt.Dimension(50, 23));
        b53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b53ActionPerformed(evt);
            }
        });
        getContentPane().add(b53, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 42, 38));

        b54.setText("jButton101");
        b54.setPreferredSize(new java.awt.Dimension(50, 23));
        b54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b54ActionPerformed(evt);
            }
        });
        getContentPane().add(b54, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 42, 38));

        b55.setPreferredSize(new java.awt.Dimension(50, 23));
        b55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b55ActionPerformed(evt);
            }
        });
        getContentPane().add(b55, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, 38));

        b56.setPreferredSize(new java.awt.Dimension(50, 23));
        b56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b56ActionPerformed(evt);
            }
        });
        getContentPane().add(b56, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 42, 38));

        b57.setText("jButton101");
        b57.setPreferredSize(new java.awt.Dimension(50, 23));
        b57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b57ActionPerformed(evt);
            }
        });
        getContentPane().add(b57, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, 42, 38));

        b58.setText("jButton101");
        b58.setPreferredSize(new java.awt.Dimension(50, 23));
        b58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b58ActionPerformed(evt);
            }
        });
        getContentPane().add(b58, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 42, 38));

        b59.setText("jButton101");
        b59.setPreferredSize(new java.awt.Dimension(50, 23));
        b59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b59ActionPerformed(evt);
            }
        });
        getContentPane().add(b59, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 42, 38));

        b60.setText("jButton101");
        b60.setPreferredSize(new java.awt.Dimension(50, 23));
        b60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b60ActionPerformed(evt);
            }
        });
        getContentPane().add(b60, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 42, 38));

        b61.setText("jButton101");
        b61.setPreferredSize(new java.awt.Dimension(50, 23));
        b61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b61ActionPerformed(evt);
            }
        });
        getContentPane().add(b61, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 42, 38));

        b62.setText("jButton101");
        b62.setPreferredSize(new java.awt.Dimension(50, 23));
        b62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b62ActionPerformed(evt);
            }
        });
        getContentPane().add(b62, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 42, 38));

        b63.setText("jButton101");
        b63.setPreferredSize(new java.awt.Dimension(50, 23));
        b63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b63ActionPerformed(evt);
            }
        });
        getContentPane().add(b63, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 42, 38));

        b64.setText("jButton101");
        b64.setPreferredSize(new java.awt.Dimension(50, 23));
        b64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b64ActionPerformed(evt);
            }
        });
        getContentPane().add(b64, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 42, 38));

        b65.setText("jButton101");
        b65.setPreferredSize(new java.awt.Dimension(50, 23));
        b65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b65ActionPerformed(evt);
            }
        });
        getContentPane().add(b65, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 42, 38));

        b66.setText("jButton101");
        b66.setPreferredSize(new java.awt.Dimension(50, 23));
        b66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b66ActionPerformed(evt);
            }
        });
        getContentPane().add(b66, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 42, 38));

        b67.setText("jButton101");
        b67.setPreferredSize(new java.awt.Dimension(50, 23));
        b67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b67ActionPerformed(evt);
            }
        });
        getContentPane().add(b67, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 42, 38));

        b68.setText("jButton101");
        b68.setPreferredSize(new java.awt.Dimension(50, 23));
        b68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b68ActionPerformed(evt);
            }
        });
        getContentPane().add(b68, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 42, 38));

        b69.setText("jButton101");
        b69.setPreferredSize(new java.awt.Dimension(50, 23));
        b69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b69ActionPerformed(evt);
            }
        });
        getContentPane().add(b69, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 42, 38));

        b70.setText("jButton101");
        b70.setPreferredSize(new java.awt.Dimension(50, 23));
        b70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b70ActionPerformed(evt);
            }
        });
        getContentPane().add(b70, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 42, 38));

        b71.setText("jButton101");
        b71.setPreferredSize(new java.awt.Dimension(50, 23));
        b71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b71ActionPerformed(evt);
            }
        });
        getContentPane().add(b71, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 42, 38));

        b72.setText("jButton101");
        b72.setPreferredSize(new java.awt.Dimension(50, 23));
        b72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b72ActionPerformed(evt);
            }
        });
        getContentPane().add(b72, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 42, 38));

        b73.setText("jButton101");
        b73.setPreferredSize(new java.awt.Dimension(50, 23));
        b73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b73ActionPerformed(evt);
            }
        });
        getContentPane().add(b73, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 42, 38));

        b74.setText("jButton101");
        b74.setPreferredSize(new java.awt.Dimension(50, 23));
        b74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b74ActionPerformed(evt);
            }
        });
        getContentPane().add(b74, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 42, 38));

        b75.setText("jButton101");
        b75.setPreferredSize(new java.awt.Dimension(50, 23));
        b75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b75ActionPerformed(evt);
            }
        });
        getContentPane().add(b75, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 42, 38));

        b76.setText("jButton101");
        b76.setPreferredSize(new java.awt.Dimension(50, 23));
        b76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b76ActionPerformed(evt);
            }
        });
        getContentPane().add(b76, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 42, 38));

        b77.setPreferredSize(new java.awt.Dimension(50, 23));
        b77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b77ActionPerformed(evt);
            }
        });
        getContentPane().add(b77, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 42, 38));

        b78.setPreferredSize(new java.awt.Dimension(50, 23));
        b78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b78ActionPerformed(evt);
            }
        });
        getContentPane().add(b78, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 42, 38));

        b79.setPreferredSize(new java.awt.Dimension(50, 23));
        b79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b79ActionPerformed(evt);
            }
        });
        getContentPane().add(b79, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 42, 38));

        b80.setPreferredSize(new java.awt.Dimension(50, 23));
        b80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b80ActionPerformed(evt);
            }
        });
        getContentPane().add(b80, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 42, 38));

        b97.setPreferredSize(new java.awt.Dimension(50, 23));
        b97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b97ActionPerformed(evt);
            }
        });
        getContentPane().add(b97, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 42, 38));

        b98.setPreferredSize(new java.awt.Dimension(50, 23));
        b98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b98ActionPerformed(evt);
            }
        });
        getContentPane().add(b98, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 42, 38));

        b99.setPreferredSize(new java.awt.Dimension(50, 23));
        b99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b99ActionPerformed(evt);
            }
        });
        getContentPane().add(b99, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 42, 38));

        b100.setPreferredSize(new java.awt.Dimension(50, 23));
        b100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b100ActionPerformed(evt);
            }
        });
        getContentPane().add(b100, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 42, 38));

        b81.setPreferredSize(new java.awt.Dimension(50, 23));
        b81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b81ActionPerformed(evt);
            }
        });
        getContentPane().add(b81, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 42, 38));

        b82.setPreferredSize(new java.awt.Dimension(50, 23));
        b82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b82ActionPerformed(evt);
            }
        });
        getContentPane().add(b82, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 42, 38));

        b83.setPreferredSize(new java.awt.Dimension(50, 23));
        b83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b83ActionPerformed(evt);
            }
        });
        getContentPane().add(b83, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 42, 38));

        b84.setPreferredSize(new java.awt.Dimension(50, 23));
        b84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b84ActionPerformed(evt);
            }
        });
        getContentPane().add(b84, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 42, 38));

        b85.setPreferredSize(new java.awt.Dimension(50, 23));
        b85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b85ActionPerformed(evt);
            }
        });
        getContentPane().add(b85, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 42, 38));

        b86.setPreferredSize(new java.awt.Dimension(50, 23));
        b86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b86ActionPerformed(evt);
            }
        });
        getContentPane().add(b86, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 42, 38));

        b87.setPreferredSize(new java.awt.Dimension(50, 23));
        b87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b87ActionPerformed(evt);
            }
        });
        getContentPane().add(b87, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 42, 38));

        b88.setPreferredSize(new java.awt.Dimension(50, 23));
        b88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b88ActionPerformed(evt);
            }
        });
        getContentPane().add(b88, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 42, 38));

        b89.setPreferredSize(new java.awt.Dimension(50, 23));
        b89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b89ActionPerformed(evt);
            }
        });
        getContentPane().add(b89, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 42, 38));

        b92.setPreferredSize(new java.awt.Dimension(50, 23));
        b92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b92ActionPerformed(evt);
            }
        });
        getContentPane().add(b92, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 42, 38));

        b90.setPreferredSize(new java.awt.Dimension(50, 23));
        b90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b90ActionPerformed(evt);
            }
        });
        getContentPane().add(b90, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 42, 38));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/Tablero2.1.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 610, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b93ActionPerformed
        posicion(b93);
    }//GEN-LAST:event_b93ActionPerformed

    private void b94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b94ActionPerformed
        posicion(b94);
    }//GEN-LAST:event_b94ActionPerformed

    private void b95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b95ActionPerformed
        posicion(b95);
    }//GEN-LAST:event_b95ActionPerformed

    private void b96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b96ActionPerformed
        posicion(b96);
    }//GEN-LAST:event_b96ActionPerformed

    private void b91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b91ActionPerformed
        posicion(b91);
    }//GEN-LAST:event_b91ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        posicion(b10);
    }//GEN-LAST:event_b10ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        posicion(b9);
    }//GEN-LAST:event_b9ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        posicion(b8);
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        posicion(b7);
    }//GEN-LAST:event_b7ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        posicion(b6);
    }//GEN-LAST:event_b6ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        posicion(b5);
    }//GEN-LAST:event_b5ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        posicion(b4);
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        posicion(b3);
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        posicion(b2);
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        posicion(b1);

    }//GEN-LAST:event_b1ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        posicion(b20);
    }//GEN-LAST:event_b20ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        posicion(b19);
    }//GEN-LAST:event_b19ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        posicion(b18);
    }//GEN-LAST:event_b18ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        posicion(b17);
    }//GEN-LAST:event_b17ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        posicion(b16);
    }//GEN-LAST:event_b16ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        posicion(b15);
    }//GEN-LAST:event_b15ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        posicion(b14);
    }//GEN-LAST:event_b14ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        posicion(b13);
    }//GEN-LAST:event_b13ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        posicion(b12);
    }//GEN-LAST:event_b12ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        posicion(b11);
    }//GEN-LAST:event_b11ActionPerformed

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b30ActionPerformed
        posicion(b30);
    }//GEN-LAST:event_b30ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        posicion(b29);

    }//GEN-LAST:event_b29ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
        posicion(b28);
    }//GEN-LAST:event_b28ActionPerformed

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
        posicion(b27);
    }//GEN-LAST:event_b27ActionPerformed

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b26ActionPerformed
        posicion(b26);
    }//GEN-LAST:event_b26ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        posicion(b25);
    }//GEN-LAST:event_b25ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        posicion(b24);
    }//GEN-LAST:event_b24ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        posicion(b23);
    }//GEN-LAST:event_b23ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        posicion(b22);
    }//GEN-LAST:event_b22ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        posicion(b21);
    }//GEN-LAST:event_b21ActionPerformed

    private void b40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b40ActionPerformed
        posicion(b40);
    }//GEN-LAST:event_b40ActionPerformed

    private void b39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b39ActionPerformed
        posicion(b39);
    }//GEN-LAST:event_b39ActionPerformed

    private void b38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b38ActionPerformed
        posicion(b38);
    }//GEN-LAST:event_b38ActionPerformed

    private void b37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b37ActionPerformed
        posicion(b37);
    }//GEN-LAST:event_b37ActionPerformed

    private void b36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b36ActionPerformed
        posicion(b36);
    }//GEN-LAST:event_b36ActionPerformed

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b35ActionPerformed
        posicion(b35);
    }//GEN-LAST:event_b35ActionPerformed

    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34ActionPerformed
        posicion(b34);
    }//GEN-LAST:event_b34ActionPerformed

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        posicion(b33);
    }//GEN-LAST:event_b33ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
        posicion(b32);
    }//GEN-LAST:event_b32ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
        posicion(b31);
    }//GEN-LAST:event_b31ActionPerformed

    private void b50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b50ActionPerformed
        posicion(b50);
    }//GEN-LAST:event_b50ActionPerformed

    private void b49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b49ActionPerformed
        posicion(b49);
    }//GEN-LAST:event_b49ActionPerformed

    private void b48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b48ActionPerformed
        posicion(b48);
    }//GEN-LAST:event_b48ActionPerformed

    private void b47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b47ActionPerformed
        posicion(b47);
    }//GEN-LAST:event_b47ActionPerformed

    private void b46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b46ActionPerformed
        posicion(b46);
    }//GEN-LAST:event_b46ActionPerformed

    private void b45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b45ActionPerformed
        posicion(b45);
    }//GEN-LAST:event_b45ActionPerformed

    private void b44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b44ActionPerformed
        posicion(b44);
    }//GEN-LAST:event_b44ActionPerformed

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b43ActionPerformed
        posicion(b43);
    }//GEN-LAST:event_b43ActionPerformed

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b42ActionPerformed
        posicion(b42);
    }//GEN-LAST:event_b42ActionPerformed

    private void b41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b41ActionPerformed
        posicion(b41);
    }//GEN-LAST:event_b41ActionPerformed

    private void b51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b51ActionPerformed
        posicion(b51);
    }//GEN-LAST:event_b51ActionPerformed

    private void b52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b52ActionPerformed
        posicion(b52);
    }//GEN-LAST:event_b52ActionPerformed

    private void b53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b53ActionPerformed
        posicion(b53);
    }//GEN-LAST:event_b53ActionPerformed

    private void b54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b54ActionPerformed
        posicion(b54);
    }//GEN-LAST:event_b54ActionPerformed

    private void b55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b55ActionPerformed
        posicion(b55);
    }//GEN-LAST:event_b55ActionPerformed

    private void b56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b56ActionPerformed
        posicion(b56);
    }//GEN-LAST:event_b56ActionPerformed

    private void b57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b57ActionPerformed
        posicion(b57);
    }//GEN-LAST:event_b57ActionPerformed

    private void b58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b58ActionPerformed
        posicion(b58);
    }//GEN-LAST:event_b58ActionPerformed

    private void b59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b59ActionPerformed
        posicion(b59);
    }//GEN-LAST:event_b59ActionPerformed

    private void b60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b60ActionPerformed
        posicion(b60);
    }//GEN-LAST:event_b60ActionPerformed

    private void b61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b61ActionPerformed
        posicion(b61);
    }//GEN-LAST:event_b61ActionPerformed

    private void b62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b62ActionPerformed
        posicion(b62);
    }//GEN-LAST:event_b62ActionPerformed

    private void b63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b63ActionPerformed
        posicion(b63);
    }//GEN-LAST:event_b63ActionPerformed

    private void b64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b64ActionPerformed
        posicion(b64);
    }//GEN-LAST:event_b64ActionPerformed

    private void b65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b65ActionPerformed
        posicion(b65);
    }//GEN-LAST:event_b65ActionPerformed

    private void b66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b66ActionPerformed
        posicion(b66);
    }//GEN-LAST:event_b66ActionPerformed

    private void b67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b67ActionPerformed
        posicion(b67);
    }//GEN-LAST:event_b67ActionPerformed

    private void b68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b68ActionPerformed
        posicion(b68);
    }//GEN-LAST:event_b68ActionPerformed

    private void b69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b69ActionPerformed
        posicion(b69);
    }//GEN-LAST:event_b69ActionPerformed

    private void b70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b70ActionPerformed
        posicion(b70);
    }//GEN-LAST:event_b70ActionPerformed

    private void b71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b71ActionPerformed
        posicion(b71);
    }//GEN-LAST:event_b71ActionPerformed

    private void b72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b72ActionPerformed
        posicion(b72);
    }//GEN-LAST:event_b72ActionPerformed

    private void b73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b73ActionPerformed
        posicion(b73);
    }//GEN-LAST:event_b73ActionPerformed

    private void b74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b74ActionPerformed
        posicion(b74);
    }//GEN-LAST:event_b74ActionPerformed

    private void b75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b75ActionPerformed
        posicion(b75);
    }//GEN-LAST:event_b75ActionPerformed

    private void b76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b76ActionPerformed
        posicion(b76);
    }//GEN-LAST:event_b76ActionPerformed

    private void b77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b77ActionPerformed
        posicion(b77);
    }//GEN-LAST:event_b77ActionPerformed

    private void b78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b78ActionPerformed
        posicion(b78);
    }//GEN-LAST:event_b78ActionPerformed

    private void b79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b79ActionPerformed
        posicion(b79);
    }//GEN-LAST:event_b79ActionPerformed

    private void b80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b80ActionPerformed
        posicion(b80);
    }//GEN-LAST:event_b80ActionPerformed

    private void b97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b97ActionPerformed
        posicion(b97);
    }//GEN-LAST:event_b97ActionPerformed

    private void b98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b98ActionPerformed
        posicion(b98);
    }//GEN-LAST:event_b98ActionPerformed

    private void b99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b99ActionPerformed
        posicion(b99);
    }//GEN-LAST:event_b99ActionPerformed

    private void b100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b100ActionPerformed
        posicion(b100);
    }//GEN-LAST:event_b100ActionPerformed

    private void b81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b81ActionPerformed
        posicion(b81);
    }//GEN-LAST:event_b81ActionPerformed

    private void b82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b82ActionPerformed
        posicion(b82);
    }//GEN-LAST:event_b82ActionPerformed

    private void b83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b83ActionPerformed
        posicion(b83);
    }//GEN-LAST:event_b83ActionPerformed

    private void b84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b84ActionPerformed
        posicion(b84);
    }//GEN-LAST:event_b84ActionPerformed

    private void b85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b85ActionPerformed
        posicion(b85);
    }//GEN-LAST:event_b85ActionPerformed

    private void b86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b86ActionPerformed
        posicion(b86);
    }//GEN-LAST:event_b86ActionPerformed

    private void b87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b87ActionPerformed
        posicion(b87);
    }//GEN-LAST:event_b87ActionPerformed

    private void b88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b88ActionPerformed
        posicion(b88);
    }//GEN-LAST:event_b88ActionPerformed

    private void b89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b89ActionPerformed
        posicion(b89);
    }//GEN-LAST:event_b89ActionPerformed

    private void b92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b92ActionPerformed
        posicion(b92);
    }//GEN-LAST:event_b92ActionPerformed

    private void b90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b90ActionPerformed
        posicion(b90);
    }//GEN-LAST:event_b90ActionPerformed

    private void b94ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_b94ComponentAdded

    }//GEN-LAST:event_b94ComponentAdded

    private void b94ComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_b94ComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_b94ComponentRemoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Swingpractica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Swingpractica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Swingpractica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Swingpractica1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Swingpractica1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b10;
    private javax.swing.JButton b100;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b13;
    private javax.swing.JButton b14;
    private javax.swing.JButton b15;
    private javax.swing.JButton b16;
    private javax.swing.JButton b17;
    private javax.swing.JButton b18;
    private javax.swing.JButton b19;
    private javax.swing.JButton b2;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JButton b23;
    private javax.swing.JButton b24;
    private javax.swing.JButton b25;
    private javax.swing.JButton b26;
    private javax.swing.JButton b27;
    private javax.swing.JButton b28;
    private javax.swing.JButton b29;
    private javax.swing.JButton b3;
    private javax.swing.JButton b30;
    private javax.swing.JButton b31;
    private javax.swing.JButton b32;
    private javax.swing.JButton b33;
    private javax.swing.JButton b34;
    private javax.swing.JButton b35;
    private javax.swing.JButton b36;
    private javax.swing.JButton b37;
    private javax.swing.JButton b38;
    private javax.swing.JButton b39;
    private javax.swing.JButton b4;
    private javax.swing.JButton b40;
    private javax.swing.JButton b41;
    private javax.swing.JButton b42;
    private javax.swing.JButton b43;
    private javax.swing.JButton b44;
    private javax.swing.JButton b45;
    private javax.swing.JButton b46;
    private javax.swing.JButton b47;
    private javax.swing.JButton b48;
    private javax.swing.JButton b49;
    private javax.swing.JButton b5;
    private javax.swing.JButton b50;
    private javax.swing.JButton b51;
    private javax.swing.JButton b52;
    private javax.swing.JButton b53;
    private javax.swing.JButton b54;
    private javax.swing.JButton b55;
    private javax.swing.JButton b56;
    private javax.swing.JButton b57;
    private javax.swing.JButton b58;
    private javax.swing.JButton b59;
    private javax.swing.JButton b6;
    private javax.swing.JButton b60;
    private javax.swing.JButton b61;
    private javax.swing.JButton b62;
    private javax.swing.JButton b63;
    private javax.swing.JButton b64;
    private javax.swing.JButton b65;
    private javax.swing.JButton b66;
    private javax.swing.JButton b67;
    private javax.swing.JButton b68;
    private javax.swing.JButton b69;
    private javax.swing.JButton b7;
    private javax.swing.JButton b70;
    private javax.swing.JButton b71;
    private javax.swing.JButton b72;
    private javax.swing.JButton b73;
    private javax.swing.JButton b74;
    private javax.swing.JButton b75;
    private javax.swing.JButton b76;
    private javax.swing.JButton b77;
    private javax.swing.JButton b78;
    private javax.swing.JButton b79;
    private javax.swing.JButton b8;
    private javax.swing.JButton b80;
    private javax.swing.JButton b81;
    private javax.swing.JButton b82;
    private javax.swing.JButton b83;
    private javax.swing.JButton b84;
    private javax.swing.JButton b85;
    private javax.swing.JButton b86;
    private javax.swing.JButton b87;
    private javax.swing.JButton b88;
    private javax.swing.JButton b89;
    private javax.swing.JButton b9;
    private javax.swing.JButton b90;
    private javax.swing.JButton b91;
    private javax.swing.JButton b92;
    private javax.swing.JButton b93;
    private javax.swing.JButton b94;
    private javax.swing.JButton b95;
    private javax.swing.JButton b96;
    private javax.swing.JButton b97;
    private javax.swing.JButton b98;
    private javax.swing.JButton b99;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
