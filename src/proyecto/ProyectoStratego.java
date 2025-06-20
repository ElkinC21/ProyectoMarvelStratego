package proyecto;

import java.awt.Image;

import javax.swing.JButton;

import java.util.Random;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;

public class ProyectoStratego extends javax.swing.JFrame {

    private javax.swing.border.Border[][] Borders = new javax.swing.border.Border[10][10];
    private Ficha fichaseleccionada = null;
    private int filasalida, colsalida;
    private String turno = "Heroes";
    JButton tableroBotones[][] = new JButton[10][10];
    Ficha fichas[][] = new Ficha[10][10];
    Random random = new Random();
    public Ficha heroes[] = new Ficha[40];
    public Ficha villanos[] = new Ficha[40];
    Ficha tablas = new Ficha();

    private ImageIcon[][] guardariconos = new ImageIcon[10][10];

    String beast = "BEAST.png";
    String blackWidow = "BLACKWIDOW.png";
    String blade = "BLADE.png";
    String captainAmerica = "CAPTAINAMERICA.png";
    String punisher = "PUNISHER.png";
    String colossus = "COLOSSUS.png";
    String cyclops = "CYCLOPS.png";
    String daredevil = "DAREDEVIL.png";
    String drStrange = "DRSTRANGE.png";
    String thing = "THING.png";
    String emmaFrost = "EMMAFROST.png";
    String ghostRider = "GHOSTRIDER.png";
    String giantMan = "GIANTMAN.png";
    String hulk = "HULK.png";
    String humanTorch = "HUMANTORCH.png";
    String iceMan = "ICEMAN.png";
    String invisibleWoman = "INVISIBLEWOMAN.png";
    String ironMan = "IRONMAN.png";
    String nightcrawler = "nightcrawler.png";
    String mrFantastic = "MRFANTASTIC.png";
    String namor = "NAMOR.png";
    String nickFury = "NICKFURY.png";
    String phoenix = "PHOENIX.png";
    String proffesorX = "PROFFESORX.png";
    String sheHulk = "SHEHULK.png";
    String silverSurfer = "SILVERSURFER.png";
    String spiderGirl = "SPIDERGIRL.png";
    String spiderMan = "SPIDERMAN.png";
    String storm = "STORM.png";
    String thor = "THOR.png";
    String wolverine = "WOLVERINE.png";
    String elektra = "ELEKTRA.png";
    String gambit = "GAMBIT.png";
    String novaBlast = "NOVABLAST.png";
    String planetaTierra = "PLANETATIERRA.png";
    String drDoom = "DRDOOM.png";
    String galactus = "GALACTUS.png";
    String kingpin = "KINGPIN.png";
    String magneto = "MAGNETO.png";
    String apocalypse = "APOCALYPSE.png";
    String greenGoblin = "GREENGOBLIN.png";
    String venom = "VENOM.png";
    String bullseye = "BULLSEYE.png";
    String omegaRed = "OMEGARED.png";
    String onslaught = "ONSLAUGHT.png";
    String redSkull = "REDSKULL.png";
    String mystyque = "MYSTYQUE.png";
    String mysterio = "MYSTERIO.png";
    String drOctopus = "DROCTOPUS.png";
    String deadpool = "DEADPOOL.png";
    String abomination = "ABOMINATION2.png";
    String thanos = "THANOS.png";
    String blackcat = "BLACKCAT.png";
    String sabretooth = "SABRETOOTH.png";
    String juggernaut = "JUGGERNAUT.png";
    String rhino = "RHINO.png";
    String carnage = "CARNAGE.png";
    String moleMan = "MOLEMAN.png";
    String lizard = "LIZARD.png";
    String mrSinister = "MRSINISTER.png";
    String sentinel1 = "SENTINEL1.png";
    String ultron = "ULTRON.png";
    String sandman = "SANDMAN.png";
    String leader = "LEADER.png";
    String viper = "VIPER.png";
    String sentinel2 = "SENTINEL2.png";
    String electro = "ELECTRO.png";
    String blackWidowVillana = "BlackWidowvillana.png";
    String pumpkinBomb1 = "PUMPKINBOMB.png";
    String tierraVillanos = "TIERRAVILLANOS.png";

    public ProyectoStratego() {
        initComponents();

        this.setLocationRelativeTo(null);
       


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

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Borders[i][j] = tableroBotones[i][j].getBorder();
            }
        }
        ValorFichas();
        inicializarFormacion(villanos, true);
        inicializarFormacion(heroes, false);
        guardar();
        ocultarFichas();

    }

    private void pintaropciones(int fila, int columna) {
        int rango = fichas[fila][columna].getRango();
        int filaup;
        int columnaup;
        int filaleft;
        int columnaleft;
        int filaright;
        int columnaright;
        int filadown;
        int columnadown;

        if (rango != 2) {

            filaup = fila - 1;
            columnaup = columna;
            if (filaup >= 0 && movvalido(fila, columna, filaup, columnaup) && !((filaup == 4 || filaup == 5) && (columnaup == 2 || columnaup == 3 || columnaup == 6 || columnaup == 7))) {
                tableroBotones[filaup][columnaup].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

            }

            filadown = fila + 1;
            columnadown = columna;
            if (filadown < 10 && movvalido(fila, columna, filadown, columnadown) && !((filadown == 4 || filadown == 5) && (columnadown == 2 || columnadown == 3 || columnadown == 6 || columnadown == 7))) {
                tableroBotones[filadown][columnadown].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

            }

            filaleft = fila;
            columnaleft = columna - 1;
            if (columnaleft >= 0 && movvalido(fila, columna, filaleft, columnaleft) && !((filaleft == 4 || filaleft == 5) && (columnaleft == 2 || columnaleft == 3 || columnaleft == 6 || columnaleft == 7))) {
                tableroBotones[filaleft][columnaleft].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

            }

            filaright = fila;
            columnaright = columna + 1;
            if (columnaright < 10 && movvalido(fila, columna, filaright, columnaright) && !((filaright == 4 || filaright == 5) && (columnaright == 2 || columnaright == 3 || columnaright == 6 || columnaright == 7))) {
                tableroBotones[filaright][columnaright].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

            }

        } else {

            filaup = fila - 1;
            columnaup = columna;
            while (filaup >= 0) {
                if (!((filaup == 4 || filaup == 5) && (columnaup == 2 || columnaup == 3 || columnaup == 6 || columnaup == 7)) && fichas[filaup][columnaup] == null) {
                    tableroBotones[filaup][columnaup].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    filaup--;
                } else {
                    if (filaup >= 0 && !((filaup == 4 || filaup == 5) && (columnaup == 2 || columnaup == 3 || columnaup == 6 || columnaup == 7)) && fichas[filaup][columnaup] != null && !fichas[filaup][columnaup].getTipo().equals(turno)) {
                        tableroBotones[filaup][columnaup].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    }
                    break;
                }
            }

            filadown = fila + 1;
            columnadown = columna;
            while (filadown < 10) {
                if (!((filadown == 4 || filadown == 5) && (columnadown == 2 || columnadown == 3 || columnadown == 6 || columnadown == 7)) && fichas[filadown][columnadown] == null) {
                    tableroBotones[filadown][columnadown].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    filadown++;
                } else {
                    if (filadown < 10 && !((filadown == 4 || filadown == 5) && (columnadown == 2 || columnadown == 3 || columnadown == 6 || columnadown == 7)) && fichas[filadown][columnadown] != null && !fichas[filadown][columnadown].getTipo().equals(turno)) {
                        tableroBotones[filadown][columnadown].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    }
                    break;
                }
            }

            filaleft = fila;
            columnaleft = columna - 1;
            while (columnaleft >= 0) {
                if (!((filaleft == 4 || filaleft == 5) && (columnaleft == 2 || columnaleft == 3 || columnaleft == 6 || columnaleft == 7)) && fichas[filaleft][columnaleft] == null) {
                    tableroBotones[filaleft][columnaleft].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    columnaleft--;
                } else {
                    if (columnaleft >= 0 && !((filaleft == 4 || filaleft == 5) && (columnaleft == 2 || columnaleft == 3 || columnaleft == 6 || columnaleft == 7)) && fichas[filaleft][columnaleft] != null && !fichas[filaleft][columnaleft].getTipo().equals(turno)) {
                        tableroBotones[filaleft][columnaleft].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    }
                    break;
                }
            }

            filaright = fila;
            columnaright = columna + 1;
            while (columnaright < 10) {
                if (!((filaright == 4 || filaright == 5) && (columnaright == 2 || columnaright == 3 || columnaright == 6 || columnaright == 7)) && fichas[filaright][columnaright] == null) {
                    tableroBotones[filaright][columnaright].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    columnaright++;
                } else {
                    if (columnaright < 10 && !((filaright == 4 || filaright == 5) && (columnaright == 2 || columnaright == 3 || columnaright == 6 || columnaright == 7)) && fichas[filaright][columnaright] != null && !fichas[filaright][columnaright].getTipo().equals(turno)) {
                        tableroBotones[filaright][columnaright].setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GREEN, 2));

                    }
                    break;
                }
            }
        }
    }

    private boolean vermovimientos() {
        for (int fila = 0; fila < 10; fila++) {

            for (int columna = 0; columna < 10; columna++) {

                Ficha ficha = fichas[fila][columna];
                if (ficha != null && ficha.getTipo().equals(turno)) {

                    int movimientos[][] = {
                        {-1, 0},
                        {1, 0},
                        {0, -1},
                        {0, 1},};

                    for (int moves = 0; moves < movimientos.length; moves++) {
                        int movfila = movimientos[moves][0];
                        int movcolumna = movimientos[moves][1];
                        int nuevafila = fila + movfila;
                        int nuevacolumna = columna + movcolumna;
                        if (nuevafila >= 0 && nuevafila < 10
                                && nuevacolumna >= 0 && nuevacolumna < 10) {
                            if (movvalido(fila, columna, nuevafila, nuevacolumna)) {
                                return true;
                            }
                        }
                    }
                }

            }
        }
        return false;
    }

    private void limpiarpintados() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tableroBotones[i][j].setBorder(Borders[i][j]);

            }
        }
    }

    private void ValorFichas() {

        heroes[0] = new Ficha("Beast", new ImageIcon(getClass().getResource(beast)), "Heroes", 3);
        heroes[1] = new Ficha("Black Widow", new ImageIcon(getClass().getResource(blackWidow)), "Heroes", 1);
        heroes[2] = new Ficha("Blade", new ImageIcon(getClass().getResource(blade)), "Heroes", 4);
        heroes[3] = new Ficha("Captain America", new ImageIcon(getClass().getResource(captainAmerica)), "Heroes", 9);
        heroes[4] = new Ficha("Punisher", new ImageIcon(getClass().getResource(punisher)), "Heroes", 4);
        heroes[5] = new Ficha("Colossus", new ImageIcon(getClass().getResource(colossus)), "Heroes", 3);
        heroes[6] = new Ficha("Cyclops", new ImageIcon(getClass().getResource(cyclops)), "Heroes", 5);
        heroes[7] = new Ficha("Daredevil", new ImageIcon(getClass().getResource(daredevil)), "Heroes", 6);
        heroes[8] = new Ficha("Dr Strange", new ImageIcon(getClass().getResource(drStrange)), "Heroes", 2);
        heroes[9] = new Ficha("Thing", new ImageIcon(getClass().getResource(thing)), "Heroes", 4);
        heroes[10] = new Ficha("Emma Frost", new ImageIcon(getClass().getResource(emmaFrost)), "Heroes", 3);
        heroes[11] = new Ficha("Ghost Rider", new ImageIcon(getClass().getResource(ghostRider)), "Heroes", 4);
        heroes[12] = new Ficha("Giant Man", new ImageIcon(getClass().getResource(giantMan)), "Heroes", 3);
        heroes[13] = new Ficha("Hulk", new ImageIcon(getClass().getResource(hulk)), "Heroes", 6);
        heroes[14] = new Ficha("Human Torch", new ImageIcon(getClass().getResource(humanTorch)), "Heroes", 5);
        heroes[15] = new Ficha("Ice Man", new ImageIcon(getClass().getResource(iceMan)), "Heroes", 2);
        heroes[16] = new Ficha("Invisible Woman", new ImageIcon(getClass().getResource(invisibleWoman)), "Heroes", 5);
        heroes[17] = new Ficha("Iron Man", new ImageIcon(getClass().getResource(ironMan)), "Heroes", 6);
        heroes[18] = new Ficha("Nightcrawler", new ImageIcon(getClass().getResource(nightcrawler)), "Heroes", 2);
        heroes[19] = new Ficha("Mr Fantastic", new ImageIcon(getClass().getResource(mrFantastic)), "Heroes", 10);
        heroes[20] = new Ficha("Namor", new ImageIcon(getClass().getResource(namor)), "Heroes", 7);
        heroes[21] = new Ficha("Nick Fury", new ImageIcon(getClass().getResource(nickFury)), "Heroes", 8);
        heroes[22] = new Ficha("Phoenix", new ImageIcon(getClass().getResource(phoenix)), "Heroes", 2);
        heroes[23] = new Ficha("Proffesor X", new ImageIcon(getClass().getResource(proffesorX)), "Heroes", 8);
        heroes[24] = new Ficha("She-Hulk", new ImageIcon(getClass().getResource(sheHulk)), "Heroes", 3);
        heroes[25] = new Ficha("Silver Surfer", new ImageIcon(getClass().getResource(silverSurfer)), "Heroes", 6);
        heroes[26] = new Ficha("Spider Girl", new ImageIcon(getClass().getResource(spiderGirl)), "Heroes", 2);
        heroes[27] = new Ficha("Spider Man", new ImageIcon(getClass().getResource(spiderMan)), "Heroes", 7);
        heroes[28] = new Ficha("Storm", new ImageIcon(getClass().getResource(storm)), "Heroes", 2);
        heroes[29] = new Ficha("Thor", new ImageIcon(getClass().getResource(thor)), "Heroes", 5);
        heroes[30] = new Ficha("Wolverine", new ImageIcon(getClass().getResource(wolverine)), "Heroes", 7);
        heroes[31] = new Ficha("Elektra", new ImageIcon(getClass().getResource(elektra)), "Heroes", 2);
        heroes[32] = new Ficha("Gambit", new ImageIcon(getClass().getResource(gambit)), "Heroes", 2);
        heroes[33] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[34] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[35] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[36] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[37] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[38] = new Ficha("Nova Blast", new ImageIcon(getClass().getResource(novaBlast)), "Heroes", 15);
        heroes[39] = new Ficha("Planeta Tierra", new ImageIcon(getClass().getResource(planetaTierra)), "Heroes", 20);

        villanos[0] = new Ficha("Dr Doom", new ImageIcon(getClass().getResource(drDoom)), "Villanos", 10);
        villanos[1] = new Ficha("Galactus", new ImageIcon(getClass().getResource(galactus)), "Villanos", 9);
        villanos[2] = new Ficha("Kingpin", new ImageIcon(getClass().getResource(kingpin)), "Villanos", 8);
        villanos[3] = new Ficha("Magneto", new ImageIcon(getClass().getResource(magneto)), "Villanos", 8);
        villanos[4] = new Ficha("Apocalypse", new ImageIcon(getClass().getResource(apocalypse)), "Villanos", 7);
        villanos[5] = new Ficha("Green Goblin", new ImageIcon(getClass().getResource(greenGoblin)), "Villanos", 7);
        villanos[6] = new Ficha("Venom", new ImageIcon(getClass().getResource(venom)), "Villanos", 7);
        villanos[7] = new Ficha("Bullseye", new ImageIcon(getClass().getResource(bullseye)), "Villanos", 6);
        villanos[8] = new Ficha("Omega Red", new ImageIcon(getClass().getResource(omegaRed)), "Villanos", 6);
        villanos[9] = new Ficha("Onslaught", new ImageIcon(getClass().getResource(onslaught)), "Villanos", 6);
        villanos[10] = new Ficha("Red Skull", new ImageIcon(getClass().getResource(redSkull)), "Villanos", 6);
        villanos[11] = new Ficha("Mystique", new ImageIcon(getClass().getResource(mystyque)), "Villanos", 5);
        villanos[12] = new Ficha("Mysterio", new ImageIcon(getClass().getResource(mysterio)), "Villanos", 5);
        villanos[13] = new Ficha("Dr Octopus", new ImageIcon(getClass().getResource(drOctopus)), "Villanos", 5);
        villanos[14] = new Ficha("Deadpool", new ImageIcon(getClass().getResource(deadpool)), "Villanos", 5);
        villanos[15] = new Ficha("Abomination", new ImageIcon(getClass().getResource(abomination)), "Villanos", 4);
        villanos[16] = new Ficha("Thanos", new ImageIcon(getClass().getResource(thanos)), "Villanos", 4);
        villanos[17] = new Ficha("Black Cat", new ImageIcon(getClass().getResource(blackcat)), "Villanos", 4);
        villanos[18] = new Ficha("Sabretooth", new ImageIcon(getClass().getResource(sabretooth)), "Villanos", 4);
        villanos[19] = new Ficha("Juggernaut", new ImageIcon(getClass().getResource(juggernaut)), "Villanos", 3);
        villanos[20] = new Ficha("Rhino", new ImageIcon(getClass().getResource(rhino)), "Villanos", 3);
        villanos[21] = new Ficha("Carnage", new ImageIcon(getClass().getResource(carnage)), "Villanos", 3);
        villanos[22] = new Ficha("Mole Man", new ImageIcon(getClass().getResource(moleMan)), "Villanos", 3);
        villanos[23] = new Ficha("Lizard", new ImageIcon(getClass().getResource(lizard)), "Villanos", 3);
        villanos[24] = new Ficha("Mr.Sinister", new ImageIcon(getClass().getResource(mrSinister)), "Villanos", 2);
        villanos[25] = new Ficha("Sentinel 1", new ImageIcon(getClass().getResource(sentinel1)), "Villanos", 2);
        villanos[26] = new Ficha("Ultron", new ImageIcon(getClass().getResource(ultron)), "Villanos", 2);
        villanos[27] = new Ficha("Sandman", new ImageIcon(getClass().getResource(sandman)), "Villanos", 2);
        villanos[28] = new Ficha("Leader", new ImageIcon(getClass().getResource(leader)), "Villanos", 2);
        villanos[29] = new Ficha("Viper", new ImageIcon(getClass().getResource(viper)), "Villanos", 2);
        villanos[30] = new Ficha("Sentinel 2", new ImageIcon(getClass().getResource(sentinel2)), "Villanos", 2);
        villanos[31] = new Ficha("Electro", new ImageIcon(getClass().getResource(electro)), "Villanos", 2);
        villanos[32] = new Ficha("Black Widow", new ImageIcon(getClass().getResource(blackWidowVillana)), "Villanos", 1);
        villanos[33] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[34] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[35] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[36] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[37] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[38] = new Ficha("Pumpkin Bomb", new ImageIcon(getClass().getResource(pumpkinBomb1)), "Villanos", 15);
        villanos[39] = new Ficha("Tierra Villanos", new ImageIcon(getClass().getResource(tierraVillanos)), "Villanos", 20);
    }

    private void guardar() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Ficha ficha = fichas[i][j];
                if (ficha != null && !ficha.getTipo().equals(turno)) {
                    guardariconos[i][j] = (ImageIcon) tableroBotones[i][j].getIcon();
                } else {
                    guardariconos[i][j] = null;
                }
            }
        }

    }

    private void ocultarFichas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (guardariconos[i][j] != null) {
                    tableroBotones[i][j].setIcon(null);
                    tableroBotones[i][j].setText("?");
                }
            }
        }
    }

    private void revelarFichas() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (guardariconos[i][j] != null) {
                    tableroBotones[i][j].setIcon(Cambiartamano(guardariconos[i][j], 60, 63));
                    tableroBotones[i][j].setText("");
                }
            }
        }
    }

    private boolean movvalido(int filasalida, int colsalida, int filadestino, int coldestino) {
        Ficha ficha = fichas[filasalida][colsalida];
        int rango = ficha.getRango();

        if (rango != 2) {
            if (filasalida == filadestino && (coldestino == colsalida + 1 || coldestino == colsalida - 1)) {
                return puedeOcupar(filadestino, coldestino, ficha);
            }
            if (colsalida == coldestino && (filadestino == filasalida + 1 || filadestino == filasalida - 1)) {
                return puedeOcupar(filadestino, coldestino, ficha);
            }
            return false;
        }

        if (filasalida == filadestino) {
            int paso;
            if (coldestino > colsalida) {
                paso = 1;
            } else {
                paso = -1;
            }
            for (int c = colsalida + paso; c != coldestino; c += paso) {
                if (fichas[filasalida][c] != null) {
                    return false;
                }
            }
            return puedeOcupar(filadestino, coldestino, ficha);
        }

        if (colsalida == coldestino) {
            int paso;
            if (filadestino > filasalida) {
                paso = 1;
            } else {
                paso = -1;
            }
            for (int f = filasalida + paso; f != filadestino; f += paso) {
                if (fichas[f][colsalida] != null) {
                    return false;
                }
            }
            return puedeOcupar(filadestino, coldestino, ficha);
        }

        return false;
    }

    private boolean puedeOcupar(int fila, int col, Ficha moverficha) {
        Ficha fichadestino = fichas[fila][col];
        if (fichadestino == null) {

            return true;
        }

        return !fichadestino.getTipo().equals(moverficha.getTipo());
    }

    private void Click(int fila, int columna) {
        limpiarpintados();

        if (fichaseleccionada != null && ((fila == 4 || fila == 5) && (columna == 2 || columna == 3 || columna == 6 || columna == 7))) {
            JOptionPane.showMessageDialog(
                    this,
                    "Esta es una zona prohibida",
                    "Movimiento no valido",
                    JOptionPane.PLAIN_MESSAGE
            );
            fichaseleccionada = null;
            return;
        }

        if (fichas[fila][columna] != null && fichaseleccionada == null) {
            fichaseleccionada = fichas[fila][columna];
            if (!fichaseleccionada.getTipo().equals(turno)) {
            JOptionPane.showMessageDialog(
                    this,
                    "TURNO DEL RIVAL!!!!!",
                    "",
                    JOptionPane.PLAIN_MESSAGE
            );
            
            fichaseleccionada = null;
            return;
        }
            filasalida = fila;
            colsalida = columna;
            pintaropciones(filasalida, colsalida);
            return;
        }

        

        if (fichaseleccionada != null) {
            int rangoOrigen = fichaseleccionada.getRango();

            if (rangoOrigen == 15) {
                JOptionPane.showMessageDialog(
                        this,
                        "Esta ficha es una bomba y no puede moverse",
                        "",
                        JOptionPane.PLAIN_MESSAGE
                );
                fichaseleccionada = null;
                return;
            }
            if (rangoOrigen == 20) {
                JOptionPane.showMessageDialog(
                        this,
                        "Esta ficha no puede moverse",
                        "",
                        JOptionPane.PLAIN_MESSAGE
                );
                fichaseleccionada = null;
                return;
            }

            if (fichas[filasalida][colsalida] != fichaseleccionada) {
                fichaseleccionada = null;
                return;
            }

            if (!movvalido(filasalida, colsalida, fila, columna)) {
                JOptionPane.showMessageDialog(
                        this,
                        "Movimiento no válido",
                        "",
                        JOptionPane.PLAIN_MESSAGE
                );
                fichaseleccionada = null;
                return;
            }

            Ficha destino = fichas[fila][columna];

            if (destino == null) {

                fichas[fila][columna] = fichaseleccionada;
                tableroBotones[fila][columna].setIcon(Cambiartamano(fichaseleccionada.getIcono(), 60, 63));
                guardariconos[fila][columna] = Cambiartamano(fichaseleccionada.getIcono(), 60, 63);
            } 
            
             else if (!destino.getTipo().equals(fichaseleccionada.getTipo())) {

                int rangoDestino = destino.getRango();

                if(rangoDestino==20&&destino.getTipo().equals("Heroes")){
                System.out.println("Fin del juego han capturado la tierra");
                return;
            }else if(rangoDestino==20&&destino.getTipo().equals("Villanos")){
                System.out.println("Fin del juego han salvado la tierra");
              return;
            }
                if (rangoDestino == 15) {

                    if (rangoOrigen == 3) {

                        fichas[fila][columna] = fichaseleccionada;
                        tableroBotones[fila][columna].setIcon(Cambiartamano(fichaseleccionada.getIcono(), 60, 63));
                        guardariconos[fila][columna] = Cambiartamano(fichaseleccionada.getIcono(), 60, 63);

                        fichas[filasalida][colsalida] = null;
                        tableroBotones[filasalida][colsalida].setIcon(null);
                        tableroBotones[filasalida][colsalida].setText("");
                        tableroBotones[filasalida][colsalida].setDisabledIcon(null);
                        tableroBotones[filasalida][colsalida].repaint();
                        guardariconos[filasalida][colsalida] = null;
                    } else {

                        fichas[fila][columna] = null;
                        fichas[filasalida][colsalida] = null;
                        tableroBotones[fila][columna].setIcon(null);
                        tableroBotones[filasalida][colsalida].setIcon(null);
                        tableroBotones[fila][columna].setText("");
                        tableroBotones[filasalida][colsalida].setText("");
                        tableroBotones[fila][columna].setDisabledIcon(null);
                        tableroBotones[filasalida][colsalida].setDisabledIcon(null);
                        tableroBotones[fila][columna].repaint();
                        tableroBotones[filasalida][colsalida].repaint();
                        guardariconos[fila][columna] = null;
                        guardariconos[filasalida][colsalida] = null;
                    }

                    if (turno.equals("Heroes")) {
                        turno = "Villanos";
                    } else {
                        turno = "Heroes";
                    }
                    jLabel1.setText("Turno: " + turno);
                    if (!vermovimientos()) {
                        JOptionPane.showMessageDialog(
                                this,
                                 turno + " no tiene movimientos posibles\nFin del juego.",
                                "Juego terminado",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                        return;
                    }
                    revelarFichas();
                    guardar();
                    ocultarFichas();
                    fichaseleccionada = null;
                    return;
                }

                if (rangoOrigen == 1 && rangoDestino == 10) {

                    fichas[fila][columna] = fichaseleccionada;
                    tableroBotones[fila][columna].setIcon(Cambiartamano(fichaseleccionada.getIcono(), 60, 63));
                    guardariconos[fila][columna]
                            = Cambiartamano(fichaseleccionada.getIcono(), 60, 63);
                } else if (rangoOrigen > rangoDestino) {

                    fichas[fila][columna] = fichaseleccionada;
                    tableroBotones[fila][columna]
                            .setIcon(Cambiartamano(fichaseleccionada.getIcono(), 60, 63));
                    guardariconos[fila][columna]
                            = Cambiartamano(fichaseleccionada.getIcono(), 60, 63);
                } else if (rangoOrigen < rangoDestino) {

                } else {

                    fichas[fila][columna] = null;
                    fichas[filasalida][colsalida] = null;
                    tableroBotones[fila][columna].setIcon(null);
                    tableroBotones[filasalida][colsalida].setIcon(null);
                    tableroBotones[fila][columna].setText("");
                    tableroBotones[filasalida][colsalida].setText("");
                    tableroBotones[fila][columna].setDisabledIcon(null);
                    tableroBotones[filasalida][colsalida].setDisabledIcon(null);
                    tableroBotones[fila][columna].repaint();
                    tableroBotones[filasalida][colsalida].repaint();
                    guardariconos[fila][columna] = null;
                    guardariconos[filasalida][colsalida] = null;
                }

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "No puedes atacar a una ficha de tu propio equipo",
                        "ERROR",
                        JOptionPane.PLAIN_MESSAGE
                );
                fichaseleccionada = null;
                return;
            }

            fichas[filasalida][colsalida] = null;
            tableroBotones[filasalida][colsalida].setIcon(null);
            tableroBotones[filasalida][colsalida].setText("");
            tableroBotones[filasalida][colsalida].setDisabledIcon(null);
            tableroBotones[filasalida][colsalida].repaint();
            guardariconos[filasalida][colsalida] = null;

            if (turno.equals("Heroes")) {
                turno = "Villanos";
            } else {
                turno = "Heroes";
            }
            jLabel1.setText("Turno: " + turno);

            revelarFichas();
            guardar();
            ocultarFichas();

            limpiarpintados();
            fichaseleccionada = null;
        }
    }

    private boolean Accion(int filasalida, int colsalida, int filadestino, int coldestino) {

        if (!movvalido(filasalida, colsalida, filadestino, coldestino)) {
            return false;
        }

        Ficha piezasalida = fichas[filasalida][colsalida];
        Ficha piezadestino = fichas[filadestino][coldestino];

        if (piezadestino == null) {
            return true;
        }
        return !piezadestino.getTipo().equals(piezasalida.getTipo());
    }

    private void inicializarFormacion(Ficha[] fichasBando, boolean esVillano) {
        int filaTierra = esVillano ? 9 : 0;
        int colTierra;
        do {
            colTierra = random.nextInt(8) + 1;
        } while (colTierra == 0 || colTierra == 9);

        Ficha tierra = fichasBando[39];
        fichas[filaTierra][colTierra] = tierra;
        tableroBotones[filaTierra][colTierra].setIcon(Cambiartamano(tierra.getIcono(), 60, 63));

        int filaArriba = esVillano ? 8 : 1;
        int[][] alrededor = {
            {filaTierra, colTierra - 1},
            {filaTierra, colTierra + 1},
            {filaArriba, colTierra},
            {filaArriba, colTierra - 1},
            {filaArriba, colTierra + 1}
        };

        int bombasColocadas = 0;
        for (int[] pos : alrededor) {
            int f = pos[0], c = pos[1];
            if (f >= 0 && f < 10 && c >= 0 && c < 10 && fichas[f][c] == null) {
                Ficha bomba = fichasBando[33 + bombasColocadas];
                fichas[f][c] = bomba;
                tableroBotones[f][c].setIcon(Cambiartamano(bomba.getIcono(), 60, 63));
                bombasColocadas++;
            }
        }

        int filaExtra1 = esVillano ? 9 : 0;
        int filaExtra2 = esVillano ? 8 : 1;
        for (int i = bombasColocadas; i < 6; i++) {
            while (true) {
                int f = random.nextBoolean() ? filaExtra1 : filaExtra2;
                int c = random.nextInt(10);
                if (fichas[f][c] == null) {
                    Ficha bomba = fichasBando[33 + i];
                    fichas[f][c] = bomba;
                    tableroBotones[f][c].setIcon(Cambiartamano(bomba.getIcono(), 60, 63));
                    break;
                }
            }
        }

        int filaR1 = esVillano ? 6 : 2;
        int filaR2 = esVillano ? 7 : 3;
        for (Ficha ficha : fichasBando) {
            if (ficha.getRango() == 2) {
                while (true) {
                    int f = random.nextBoolean() ? filaR1 : filaR2;
                    int c = random.nextInt(10);
                    if (fichas[f][c] == null) {
                        fichas[f][c] = ficha;
                        tableroBotones[f][c].setIcon(Cambiartamano(ficha.getIcono(), 60, 63));
                        break;
                    }
                }
            }
        }

        int filaMin = esVillano ? 6 : 0;
        int filaMax = esVillano ? 9 : 3;
        for (Ficha ficha : fichasBando) {

            boolean colocada = false;
            for (int f = filaMin; f <= filaMax; f++) {
                for (int c = 0; c < 10; c++) {
                    if (fichas[f][c] == ficha) {
                        colocada = true;
                        break;
                    }
                }
                if (colocada) {
                    break;
                }
            }

            if (!colocada) {
                while (true) {
                    int f = filaMin + random.nextInt(filaMax - filaMin + 1);
                    int c = random.nextInt(10);
                    if (fichas[f][c] == null) {
                        fichas[f][c] = ficha;
                        tableroBotones[f][c].setIcon(Cambiartamano(ficha.getIcono(), 60, 63));
                        break;
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b13 = new javax.swing.JButton();
        b14 = new javax.swing.JButton();
        b15 = new javax.swing.JButton();
        b16 = new javax.swing.JButton();
        b17 = new javax.swing.JButton();
        b18 = new javax.swing.JButton();
        b19 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b23 = new javax.swing.JButton();
        b24 = new javax.swing.JButton();
        b25 = new javax.swing.JButton();
        b26 = new javax.swing.JButton();
        b27 = new javax.swing.JButton();
        b28 = new javax.swing.JButton();
        b29 = new javax.swing.JButton();
        b30 = new javax.swing.JButton();
        b31 = new javax.swing.JButton();
        b32 = new javax.swing.JButton();
        b33 = new javax.swing.JButton();
        b34 = new javax.swing.JButton();
        b35 = new javax.swing.JButton();
        b36 = new javax.swing.JButton();
        b37 = new javax.swing.JButton();
        b38 = new javax.swing.JButton();
        b39 = new javax.swing.JButton();
        b40 = new javax.swing.JButton();
        b41 = new javax.swing.JButton();
        b42 = new javax.swing.JButton();
        b43 = new javax.swing.JButton();
        b44 = new javax.swing.JButton();
        b45 = new javax.swing.JButton();
        b46 = new javax.swing.JButton();
        b47 = new javax.swing.JButton();
        b48 = new javax.swing.JButton();
        b49 = new javax.swing.JButton();
        b50 = new javax.swing.JButton();
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
        b81 = new javax.swing.JButton();
        b82 = new javax.swing.JButton();
        b83 = new javax.swing.JButton();
        b84 = new javax.swing.JButton();
        b85 = new javax.swing.JButton();
        b86 = new javax.swing.JButton();
        b87 = new javax.swing.JButton();
        b88 = new javax.swing.JButton();
        b89 = new javax.swing.JButton();
        b90 = new javax.swing.JButton();
        b91 = new javax.swing.JButton();
        b92 = new javax.swing.JButton();
        b93 = new javax.swing.JButton();
        b94 = new javax.swing.JButton();
        b95 = new javax.swing.JButton();
        b96 = new javax.swing.JButton();
        b97 = new javax.swing.JButton();
        b98 = new javax.swing.JButton();
        b99 = new javax.swing.JButton();
        b100 = new javax.swing.JButton();
        panelvillanoseliminados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelheroeseliminados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        b1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b1.setForeground(new java.awt.Color(204, 204, 0));
        b1.setContentAreaFilled(false);
        b1.setPreferredSize(new java.awt.Dimension(50, 23));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 710, 60, 60));

        b2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b2.setForeground(new java.awt.Color(204, 204, 0));
        b2.setContentAreaFilled(false);
        b2.setPreferredSize(new java.awt.Dimension(50, 23));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 710, 60, 60));

        b3.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b3.setForeground(new java.awt.Color(204, 204, 0));
        b3.setContentAreaFilled(false);
        b3.setPreferredSize(new java.awt.Dimension(50, 23));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 710, 60, 60));

        b4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b4.setForeground(new java.awt.Color(204, 204, 0));
        b4.setContentAreaFilled(false);
        b4.setPreferredSize(new java.awt.Dimension(50, 23));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 710, 60, 60));

        b5.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b5.setForeground(new java.awt.Color(204, 204, 0));
        b5.setContentAreaFilled(false);
        b5.setPreferredSize(new java.awt.Dimension(50, 23));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 710, 60, 60));

        b6.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b6.setForeground(new java.awt.Color(204, 204, 0));
        b6.setContentAreaFilled(false);
        b6.setPreferredSize(new java.awt.Dimension(50, 23));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, 60, 60));

        b7.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b7.setForeground(new java.awt.Color(204, 204, 0));
        b7.setContentAreaFilled(false);
        b7.setPreferredSize(new java.awt.Dimension(50, 23));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        getContentPane().add(b7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 710, 60, 60));

        b8.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b8.setForeground(new java.awt.Color(204, 204, 0));
        b8.setContentAreaFilled(false);
        b8.setPreferredSize(new java.awt.Dimension(50, 23));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 710, 60, 60));

        b9.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b9.setForeground(new java.awt.Color(204, 204, 0));
        b9.setContentAreaFilled(false);
        b9.setPreferredSize(new java.awt.Dimension(50, 23));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 710, 60, 60));

        b10.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b10.setForeground(new java.awt.Color(204, 204, 0));
        b10.setContentAreaFilled(false);
        b10.setPreferredSize(new java.awt.Dimension(50, 23));
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 710, 60, 60));

        b11.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b11.setForeground(new java.awt.Color(204, 204, 0));
        b11.setContentAreaFilled(false);
        b11.setPreferredSize(new java.awt.Dimension(50, 23));
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });
        getContentPane().add(b11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 630, 60, 60));

        b12.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b12.setForeground(new java.awt.Color(204, 204, 0));
        b12.setContentAreaFilled(false);
        b12.setPreferredSize(new java.awt.Dimension(50, 23));
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });
        getContentPane().add(b12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 630, 60, 60));

        b13.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b13.setForeground(new java.awt.Color(204, 204, 0));
        b13.setContentAreaFilled(false);
        b13.setPreferredSize(new java.awt.Dimension(50, 23));
        b13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b13ActionPerformed(evt);
            }
        });
        getContentPane().add(b13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, 60, 60));

        b14.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b14.setForeground(new java.awt.Color(204, 204, 0));
        b14.setContentAreaFilled(false);
        b14.setPreferredSize(new java.awt.Dimension(50, 23));
        b14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b14ActionPerformed(evt);
            }
        });
        getContentPane().add(b14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 630, 60, 60));

        b15.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b15.setForeground(new java.awt.Color(204, 204, 0));
        b15.setContentAreaFilled(false);
        b15.setPreferredSize(new java.awt.Dimension(50, 23));
        b15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b15ActionPerformed(evt);
            }
        });
        getContentPane().add(b15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 630, 60, 60));

        b16.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b16.setForeground(new java.awt.Color(204, 204, 0));
        b16.setContentAreaFilled(false);
        b16.setPreferredSize(new java.awt.Dimension(50, 23));
        b16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b16ActionPerformed(evt);
            }
        });
        getContentPane().add(b16, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 630, 60, 60));

        b17.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b17.setForeground(new java.awt.Color(204, 204, 0));
        b17.setContentAreaFilled(false);
        b17.setPreferredSize(new java.awt.Dimension(50, 23));
        b17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b17ActionPerformed(evt);
            }
        });
        getContentPane().add(b17, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 60, 60));

        b18.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b18.setForeground(new java.awt.Color(204, 204, 0));
        b18.setContentAreaFilled(false);
        b18.setPreferredSize(new java.awt.Dimension(50, 23));
        b18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b18ActionPerformed(evt);
            }
        });
        getContentPane().add(b18, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, 60, 60));

        b19.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b19.setForeground(new java.awt.Color(204, 204, 0));
        b19.setContentAreaFilled(false);
        b19.setPreferredSize(new java.awt.Dimension(50, 23));
        b19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b19ActionPerformed(evt);
            }
        });
        getContentPane().add(b19, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 630, 60, 60));

        b20.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b20.setForeground(new java.awt.Color(204, 204, 0));
        b20.setContentAreaFilled(false);
        b20.setPreferredSize(new java.awt.Dimension(50, 23));
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });
        getContentPane().add(b20, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 630, 60, 60));

        b21.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b21.setForeground(new java.awt.Color(204, 204, 0));
        b21.setContentAreaFilled(false);
        b21.setPreferredSize(new java.awt.Dimension(50, 23));
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });
        getContentPane().add(b21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, 60, 60));

        b22.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b22.setForeground(new java.awt.Color(204, 204, 0));
        b22.setContentAreaFilled(false);
        b22.setPreferredSize(new java.awt.Dimension(50, 23));
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });
        getContentPane().add(b22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 550, 60, 60));

        b23.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b23.setForeground(new java.awt.Color(204, 204, 0));
        b23.setContentAreaFilled(false);
        b23.setPreferredSize(new java.awt.Dimension(50, 23));
        b23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b23ActionPerformed(evt);
            }
        });
        getContentPane().add(b23, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 550, 60, 60));

        b24.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b24.setForeground(new java.awt.Color(204, 204, 0));
        b24.setContentAreaFilled(false);
        b24.setPreferredSize(new java.awt.Dimension(50, 23));
        b24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b24ActionPerformed(evt);
            }
        });
        getContentPane().add(b24, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 60, 60));

        b25.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b25.setForeground(new java.awt.Color(204, 204, 0));
        b25.setContentAreaFilled(false);
        b25.setPreferredSize(new java.awt.Dimension(50, 23));
        b25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b25ActionPerformed(evt);
            }
        });
        getContentPane().add(b25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 60, 60));

        b26.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b26.setForeground(new java.awt.Color(204, 204, 0));
        b26.setContentAreaFilled(false);
        b26.setPreferredSize(new java.awt.Dimension(50, 23));
        b26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b26ActionPerformed(evt);
            }
        });
        getContentPane().add(b26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 60, 60));

        b27.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b27.setForeground(new java.awt.Color(204, 204, 0));
        b27.setContentAreaFilled(false);
        b27.setPreferredSize(new java.awt.Dimension(50, 23));
        b27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b27ActionPerformed(evt);
            }
        });
        getContentPane().add(b27, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 550, 60, 60));

        b28.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b28.setForeground(new java.awt.Color(204, 204, 0));
        b28.setContentAreaFilled(false);
        b28.setPreferredSize(new java.awt.Dimension(50, 23));
        b28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b28ActionPerformed(evt);
            }
        });
        getContentPane().add(b28, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 550, 60, 60));

        b29.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b29.setForeground(new java.awt.Color(204, 204, 0));
        b29.setContentAreaFilled(false);
        b29.setPreferredSize(new java.awt.Dimension(50, 23));
        b29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b29ActionPerformed(evt);
            }
        });
        getContentPane().add(b29, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, 60, 60));

        b30.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b30.setForeground(new java.awt.Color(204, 204, 0));
        b30.setContentAreaFilled(false);
        b30.setPreferredSize(new java.awt.Dimension(50, 23));
        b30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b30ActionPerformed(evt);
            }
        });
        getContentPane().add(b30, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 550, 60, 60));

        b31.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b31.setForeground(new java.awt.Color(204, 204, 0));
        b31.setContentAreaFilled(false);
        b31.setPreferredSize(new java.awt.Dimension(50, 23));
        b31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b31ActionPerformed(evt);
            }
        });
        getContentPane().add(b31, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 470, 60, 60));

        b32.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b32.setForeground(new java.awt.Color(204, 204, 0));
        b32.setContentAreaFilled(false);
        b32.setPreferredSize(new java.awt.Dimension(50, 23));
        b32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b32ActionPerformed(evt);
            }
        });
        getContentPane().add(b32, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 60, 60));

        b33.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b33.setForeground(new java.awt.Color(204, 204, 0));
        b33.setContentAreaFilled(false);
        b33.setPreferredSize(new java.awt.Dimension(50, 23));
        b33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b33ActionPerformed(evt);
            }
        });
        getContentPane().add(b33, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, 60, 60));

        b34.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b34.setForeground(new java.awt.Color(204, 204, 0));
        b34.setContentAreaFilled(false);
        b34.setPreferredSize(new java.awt.Dimension(50, 23));
        b34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b34ActionPerformed(evt);
            }
        });
        getContentPane().add(b34, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 60, 60));

        b35.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b35.setForeground(new java.awt.Color(204, 204, 0));
        b35.setContentAreaFilled(false);
        b35.setPreferredSize(new java.awt.Dimension(50, 23));
        b35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b35ActionPerformed(evt);
            }
        });
        getContentPane().add(b35, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 470, 60, 60));

        b36.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b36.setForeground(new java.awt.Color(204, 204, 0));
        b36.setContentAreaFilled(false);
        b36.setPreferredSize(new java.awt.Dimension(50, 23));
        b36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b36ActionPerformed(evt);
            }
        });
        getContentPane().add(b36, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, 60, 60));

        b37.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b37.setForeground(new java.awt.Color(204, 204, 0));
        b37.setContentAreaFilled(false);
        b37.setPreferredSize(new java.awt.Dimension(50, 23));
        b37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b37ActionPerformed(evt);
            }
        });
        getContentPane().add(b37, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 470, 60, 60));

        b38.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b38.setForeground(new java.awt.Color(204, 204, 0));
        b38.setContentAreaFilled(false);
        b38.setPreferredSize(new java.awt.Dimension(50, 23));
        b38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b38ActionPerformed(evt);
            }
        });
        getContentPane().add(b38, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 60, 60));

        b39.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b39.setForeground(new java.awt.Color(204, 204, 0));
        b39.setContentAreaFilled(false);
        b39.setPreferredSize(new java.awt.Dimension(50, 23));
        b39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b39ActionPerformed(evt);
            }
        });
        getContentPane().add(b39, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 60, 60));

        b40.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b40.setForeground(new java.awt.Color(204, 204, 0));
        b40.setContentAreaFilled(false);
        b40.setPreferredSize(new java.awt.Dimension(50, 23));
        b40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b40ActionPerformed(evt);
            }
        });
        getContentPane().add(b40, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, 60, 60));

        b41.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b41.setForeground(new java.awt.Color(204, 204, 0));
        b41.setContentAreaFilled(false);
        b41.setPreferredSize(new java.awt.Dimension(50, 23));
        b41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b41ActionPerformed(evt);
            }
        });
        getContentPane().add(b41, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 60, 60));

        b42.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b42.setForeground(new java.awt.Color(204, 204, 0));
        b42.setContentAreaFilled(false);
        b42.setPreferredSize(new java.awt.Dimension(50, 23));
        b42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b42ActionPerformed(evt);
            }
        });
        getContentPane().add(b42, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 60, 60));

        b43.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b43.setForeground(new java.awt.Color(204, 204, 0));
        b43.setContentAreaFilled(false);
        b43.setPreferredSize(new java.awt.Dimension(50, 23));
        b43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b43ActionPerformed(evt);
            }
        });
        getContentPane().add(b43, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 60, 60));

        b44.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b44.setForeground(new java.awt.Color(204, 204, 0));
        b44.setContentAreaFilled(false);
        b44.setPreferredSize(new java.awt.Dimension(50, 23));
        b44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b44ActionPerformed(evt);
            }
        });
        getContentPane().add(b44, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 60, 60));

        b45.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b45.setForeground(new java.awt.Color(204, 204, 0));
        b45.setContentAreaFilled(false);
        b45.setPreferredSize(new java.awt.Dimension(50, 23));
        b45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b45ActionPerformed(evt);
            }
        });
        getContentPane().add(b45, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 60, 60));

        b46.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b46.setForeground(new java.awt.Color(204, 204, 0));
        b46.setContentAreaFilled(false);
        b46.setPreferredSize(new java.awt.Dimension(50, 23));
        b46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b46ActionPerformed(evt);
            }
        });
        getContentPane().add(b46, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 60, 60));

        b47.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b47.setForeground(new java.awt.Color(204, 204, 0));
        b47.setContentAreaFilled(false);
        b47.setPreferredSize(new java.awt.Dimension(50, 23));
        b47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b47ActionPerformed(evt);
            }
        });
        getContentPane().add(b47, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 390, 60, 60));

        b48.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b48.setForeground(new java.awt.Color(204, 204, 0));
        b48.setContentAreaFilled(false);
        b48.setPreferredSize(new java.awt.Dimension(50, 23));
        b48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b48ActionPerformed(evt);
            }
        });
        getContentPane().add(b48, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 390, 60, 60));

        b49.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b49.setForeground(new java.awt.Color(204, 204, 0));
        b49.setContentAreaFilled(false);
        b49.setPreferredSize(new java.awt.Dimension(50, 23));
        b49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b49ActionPerformed(evt);
            }
        });
        getContentPane().add(b49, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 60, 60));

        b50.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b50.setForeground(new java.awt.Color(204, 204, 0));
        b50.setContentAreaFilled(false);
        b50.setPreferredSize(new java.awt.Dimension(50, 23));
        b50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b50ActionPerformed(evt);
            }
        });
        getContentPane().add(b50, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 390, 60, 60));

        b51.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b51.setForeground(new java.awt.Color(204, 204, 0));
        b51.setContentAreaFilled(false);
        b51.setPreferredSize(new java.awt.Dimension(50, 23));
        b51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b51ActionPerformed(evt);
            }
        });
        getContentPane().add(b51, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 60, 60));

        b52.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b52.setForeground(new java.awt.Color(204, 204, 0));
        b52.setContentAreaFilled(false);
        b52.setPreferredSize(new java.awt.Dimension(50, 23));
        b52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b52ActionPerformed(evt);
            }
        });
        getContentPane().add(b52, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 60, 60));

        b53.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b53.setForeground(new java.awt.Color(204, 204, 0));
        b53.setContentAreaFilled(false);
        b53.setPreferredSize(new java.awt.Dimension(50, 23));
        b53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b53ActionPerformed(evt);
            }
        });
        getContentPane().add(b53, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 60, 60));

        b54.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b54.setForeground(new java.awt.Color(204, 204, 0));
        b54.setContentAreaFilled(false);
        b54.setPreferredSize(new java.awt.Dimension(50, 23));
        b54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b54ActionPerformed(evt);
            }
        });
        getContentPane().add(b54, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 60, 60));

        b55.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b55.setForeground(new java.awt.Color(204, 204, 0));
        b55.setContentAreaFilled(false);
        b55.setPreferredSize(new java.awt.Dimension(50, 23));
        b55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b55ActionPerformed(evt);
            }
        });
        getContentPane().add(b55, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 60, 60));

        b56.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b56.setForeground(new java.awt.Color(204, 204, 0));
        b56.setContentAreaFilled(false);
        b56.setPreferredSize(new java.awt.Dimension(50, 23));
        b56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b56ActionPerformed(evt);
            }
        });
        getContentPane().add(b56, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 60, 60));

        b57.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b57.setForeground(new java.awt.Color(204, 204, 0));
        b57.setContentAreaFilled(false);
        b57.setPreferredSize(new java.awt.Dimension(50, 23));
        b57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b57ActionPerformed(evt);
            }
        });
        getContentPane().add(b57, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 60, 60));

        b58.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b58.setForeground(new java.awt.Color(204, 204, 0));
        b58.setContentAreaFilled(false);
        b58.setPreferredSize(new java.awt.Dimension(50, 23));
        b58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b58ActionPerformed(evt);
            }
        });
        getContentPane().add(b58, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 310, 60, 60));

        b59.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b59.setForeground(new java.awt.Color(204, 204, 0));
        b59.setContentAreaFilled(false);
        b59.setPreferredSize(new java.awt.Dimension(50, 23));
        b59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b59ActionPerformed(evt);
            }
        });
        getContentPane().add(b59, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 310, 60, 60));

        b60.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b60.setForeground(new java.awt.Color(204, 204, 0));
        b60.setContentAreaFilled(false);
        b60.setPreferredSize(new java.awt.Dimension(50, 23));
        b60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b60ActionPerformed(evt);
            }
        });
        getContentPane().add(b60, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 60, 60));

        b61.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b61.setForeground(new java.awt.Color(204, 204, 0));
        b61.setContentAreaFilled(false);
        b61.setPreferredSize(new java.awt.Dimension(50, 23));
        b61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b61ActionPerformed(evt);
            }
        });
        getContentPane().add(b61, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, 60, 60));

        b62.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b62.setForeground(new java.awt.Color(204, 204, 0));
        b62.setContentAreaFilled(false);
        b62.setPreferredSize(new java.awt.Dimension(50, 23));
        b62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b62ActionPerformed(evt);
            }
        });
        getContentPane().add(b62, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 60, 60));

        b63.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b63.setForeground(new java.awt.Color(204, 204, 0));
        b63.setContentAreaFilled(false);
        b63.setPreferredSize(new java.awt.Dimension(50, 23));
        b63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b63ActionPerformed(evt);
            }
        });
        getContentPane().add(b63, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 60, 60));

        b64.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b64.setForeground(new java.awt.Color(204, 204, 0));
        b64.setContentAreaFilled(false);
        b64.setPreferredSize(new java.awt.Dimension(50, 23));
        b64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b64ActionPerformed(evt);
            }
        });
        getContentPane().add(b64, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 60, 60));

        b65.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b65.setForeground(new java.awt.Color(204, 204, 0));
        b65.setContentAreaFilled(false);
        b65.setPreferredSize(new java.awt.Dimension(50, 23));
        b65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b65ActionPerformed(evt);
            }
        });
        getContentPane().add(b65, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 60, 60));

        b66.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b66.setForeground(new java.awt.Color(204, 204, 0));
        b66.setContentAreaFilled(false);
        b66.setPreferredSize(new java.awt.Dimension(50, 23));
        b66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b66ActionPerformed(evt);
            }
        });
        getContentPane().add(b66, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 60, 60));

        b67.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b67.setForeground(new java.awt.Color(204, 204, 0));
        b67.setContentAreaFilled(false);
        b67.setPreferredSize(new java.awt.Dimension(50, 23));
        b67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b67ActionPerformed(evt);
            }
        });
        getContentPane().add(b67, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 60, 60));

        b68.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b68.setForeground(new java.awt.Color(204, 204, 0));
        b68.setContentAreaFilled(false);
        b68.setPreferredSize(new java.awt.Dimension(50, 23));
        b68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b68ActionPerformed(evt);
            }
        });
        getContentPane().add(b68, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 60, 60));

        b69.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b69.setForeground(new java.awt.Color(204, 204, 0));
        b69.setContentAreaFilled(false);
        b69.setPreferredSize(new java.awt.Dimension(50, 23));
        b69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b69ActionPerformed(evt);
            }
        });
        getContentPane().add(b69, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 60, 60));

        b70.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b70.setForeground(new java.awt.Color(204, 204, 0));
        b70.setContentAreaFilled(false);
        b70.setPreferredSize(new java.awt.Dimension(50, 23));
        b70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b70ActionPerformed(evt);
            }
        });
        getContentPane().add(b70, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, 60, 60));

        b71.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b71.setForeground(new java.awt.Color(204, 204, 0));
        b71.setContentAreaFilled(false);
        b71.setPreferredSize(new java.awt.Dimension(50, 23));
        b71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b71ActionPerformed(evt);
            }
        });
        getContentPane().add(b71, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 60, 60));

        b72.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b72.setForeground(new java.awt.Color(204, 204, 0));
        b72.setContentAreaFilled(false);
        b72.setPreferredSize(new java.awt.Dimension(50, 23));
        b72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b72ActionPerformed(evt);
            }
        });
        getContentPane().add(b72, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 60, 60));

        b73.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b73.setForeground(new java.awt.Color(204, 204, 0));
        b73.setContentAreaFilled(false);
        b73.setPreferredSize(new java.awt.Dimension(50, 23));
        b73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b73ActionPerformed(evt);
            }
        });
        getContentPane().add(b73, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 60, 60));

        b74.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b74.setForeground(new java.awt.Color(204, 204, 0));
        b74.setContentAreaFilled(false);
        b74.setPreferredSize(new java.awt.Dimension(50, 23));
        b74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b74ActionPerformed(evt);
            }
        });
        getContentPane().add(b74, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 60, 60));

        b75.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b75.setForeground(new java.awt.Color(204, 204, 0));
        b75.setContentAreaFilled(false);
        b75.setPreferredSize(new java.awt.Dimension(50, 23));
        b75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b75ActionPerformed(evt);
            }
        });
        getContentPane().add(b75, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 60, 60));

        b76.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b76.setForeground(new java.awt.Color(204, 204, 0));
        b76.setContentAreaFilled(false);
        b76.setPreferredSize(new java.awt.Dimension(50, 23));
        b76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b76ActionPerformed(evt);
            }
        });
        getContentPane().add(b76, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 60, 60));

        b77.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b77.setForeground(new java.awt.Color(204, 204, 0));
        b77.setContentAreaFilled(false);
        b77.setPreferredSize(new java.awt.Dimension(50, 23));
        b77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b77ActionPerformed(evt);
            }
        });
        getContentPane().add(b77, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 60, 60));

        b78.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b78.setForeground(new java.awt.Color(204, 204, 0));
        b78.setContentAreaFilled(false);
        b78.setPreferredSize(new java.awt.Dimension(50, 23));
        b78.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b78ActionPerformed(evt);
            }
        });
        getContentPane().add(b78, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 60, 60));

        b79.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b79.setForeground(new java.awt.Color(204, 204, 0));
        b79.setContentAreaFilled(false);
        b79.setPreferredSize(new java.awt.Dimension(50, 23));
        b79.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b79ActionPerformed(evt);
            }
        });
        getContentPane().add(b79, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 160, 60, 60));

        b80.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b80.setForeground(new java.awt.Color(204, 204, 0));
        b80.setContentAreaFilled(false);
        b80.setPreferredSize(new java.awt.Dimension(50, 23));
        b80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b80ActionPerformed(evt);
            }
        });
        getContentPane().add(b80, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 60, 60));

        b81.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b81.setForeground(new java.awt.Color(204, 204, 0));
        b81.setContentAreaFilled(false);
        b81.setPreferredSize(new java.awt.Dimension(50, 23));
        b81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b81ActionPerformed(evt);
            }
        });
        getContentPane().add(b81, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 60, 60));

        b82.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b82.setForeground(new java.awt.Color(204, 204, 0));
        b82.setContentAreaFilled(false);
        b82.setPreferredSize(new java.awt.Dimension(50, 23));
        b82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b82ActionPerformed(evt);
            }
        });
        getContentPane().add(b82, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 60, 60));

        b83.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b83.setForeground(new java.awt.Color(204, 204, 0));
        b83.setContentAreaFilled(false);
        b83.setPreferredSize(new java.awt.Dimension(50, 23));
        b83.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b83ActionPerformed(evt);
            }
        });
        getContentPane().add(b83, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 60, 60));

        b84.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b84.setForeground(new java.awt.Color(204, 204, 0));
        b84.setContentAreaFilled(false);
        b84.setPreferredSize(new java.awt.Dimension(50, 23));
        b84.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b84ActionPerformed(evt);
            }
        });
        getContentPane().add(b84, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 60, 60));

        b85.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b85.setForeground(new java.awt.Color(204, 204, 0));
        b85.setContentAreaFilled(false);
        b85.setPreferredSize(new java.awt.Dimension(50, 23));
        b85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b85ActionPerformed(evt);
            }
        });
        getContentPane().add(b85, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 60, 60));

        b86.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b86.setForeground(new java.awt.Color(204, 204, 0));
        b86.setContentAreaFilled(false);
        b86.setPreferredSize(new java.awt.Dimension(50, 23));
        b86.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b86ActionPerformed(evt);
            }
        });
        getContentPane().add(b86, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 60, 60));

        b87.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b87.setForeground(new java.awt.Color(204, 204, 0));
        b87.setContentAreaFilled(false);
        b87.setPreferredSize(new java.awt.Dimension(50, 23));
        b87.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b87ActionPerformed(evt);
            }
        });
        getContentPane().add(b87, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 60, 60));

        b88.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b88.setForeground(new java.awt.Color(204, 204, 0));
        b88.setContentAreaFilled(false);
        b88.setPreferredSize(new java.awt.Dimension(50, 23));
        b88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b88ActionPerformed(evt);
            }
        });
        getContentPane().add(b88, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 60, 60));

        b89.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b89.setForeground(new java.awt.Color(204, 204, 0));
        b89.setContentAreaFilled(false);
        b89.setPreferredSize(new java.awt.Dimension(50, 23));
        b89.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b89ActionPerformed(evt);
            }
        });
        getContentPane().add(b89, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 60, 60));

        b90.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b90.setForeground(new java.awt.Color(204, 204, 0));
        b90.setContentAreaFilled(false);
        b90.setPreferredSize(new java.awt.Dimension(50, 23));
        b90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b90ActionPerformed(evt);
            }
        });
        getContentPane().add(b90, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 90, 60, 60));

        b91.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b91.setForeground(new java.awt.Color(204, 204, 0));
        b91.setContentAreaFilled(false);
        b91.setPreferredSize(new java.awt.Dimension(50, 23));
        b91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b91ActionPerformed(evt);
            }
        });
        getContentPane().add(b91, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 60, 60));

        b92.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b92.setForeground(new java.awt.Color(204, 204, 0));
        b92.setContentAreaFilled(false);
        b92.setPreferredSize(new java.awt.Dimension(50, 23));
        b92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b92ActionPerformed(evt);
            }
        });
        getContentPane().add(b92, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 60, 60));

        b93.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b93.setForeground(new java.awt.Color(204, 204, 0));
        b93.setContentAreaFilled(false);
        b93.setPreferredSize(new java.awt.Dimension(50, 23));
        b93.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b93ActionPerformed(evt);
            }
        });
        getContentPane().add(b93, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 60, 60));

        b94.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b94.setForeground(new java.awt.Color(204, 204, 0));
        b94.setContentAreaFilled(false);
        b94.setPreferredSize(new java.awt.Dimension(50, 23));
        b94.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b94ActionPerformed(evt);
            }
        });
        getContentPane().add(b94, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 60, 60));

        b95.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b95.setForeground(new java.awt.Color(204, 204, 0));
        b95.setContentAreaFilled(false);
        b95.setPreferredSize(new java.awt.Dimension(50, 23));
        b95.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b95ActionPerformed(evt);
            }
        });
        getContentPane().add(b95, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 60, 60));

        b96.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b96.setForeground(new java.awt.Color(204, 204, 0));
        b96.setContentAreaFilled(false);
        b96.setPreferredSize(new java.awt.Dimension(50, 23));
        b96.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b96ActionPerformed(evt);
            }
        });
        getContentPane().add(b96, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 60, 60));

        b97.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b97.setForeground(new java.awt.Color(204, 204, 0));
        b97.setContentAreaFilled(false);
        b97.setPreferredSize(new java.awt.Dimension(50, 23));
        b97.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b97ActionPerformed(evt);
            }
        });
        getContentPane().add(b97, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 60, 60));

        b98.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b98.setForeground(new java.awt.Color(204, 204, 0));
        b98.setContentAreaFilled(false);
        b98.setPreferredSize(new java.awt.Dimension(50, 23));
        b98.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b98ActionPerformed(evt);
            }
        });
        getContentPane().add(b98, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 60, 60));

        b99.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b99.setForeground(new java.awt.Color(204, 204, 0));
        b99.setContentAreaFilled(false);
        b99.setPreferredSize(new java.awt.Dimension(50, 23));
        b99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b99ActionPerformed(evt);
            }
        });
        getContentPane().add(b99, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 60, 60));

        b100.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        b100.setForeground(new java.awt.Color(204, 204, 0));
        b100.setContentAreaFilled(false);
        b100.setPreferredSize(new java.awt.Dimension(50, 23));
        b100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b100ActionPerformed(evt);
            }
        });
        getContentPane().add(b100, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, 60, 60));

        jLabel1.setText("Villanos Eliminados");

        javax.swing.GroupLayout panelvillanoseliminadosLayout = new javax.swing.GroupLayout(panelvillanoseliminados);
        panelvillanoseliminados.setLayout(panelvillanoseliminadosLayout);
        panelvillanoseliminadosLayout.setHorizontalGroup(
            panelvillanoseliminadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelvillanoseliminadosLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        panelvillanoseliminadosLayout.setVerticalGroup(
            panelvillanoseliminadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelvillanoseliminadosLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        getContentPane().add(panelvillanoseliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, 260, 250));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/tablero final.png"))); // NOI18N
        jLabel5.setAlignmentX(0.5F);
        jLabel5.setMaximumSize(new java.awt.Dimension(500, 500));
        jLabel5.setMinimumSize(new java.awt.Dimension(400, 400));
        jLabel5.setPreferredSize(new java.awt.Dimension(500, 500));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1000, 780));

        jLabel2.setText("Heroes Eliminados");

        javax.swing.GroupLayout panelheroeseliminadosLayout = new javax.swing.GroupLayout(panelheroeseliminados);
        panelheroeseliminados.setLayout(panelheroeseliminadosLayout);
        panelheroeseliminadosLayout.setHorizontalGroup(
            panelheroeseliminadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelheroeseliminadosLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel2)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        panelheroeseliminadosLayout.setVerticalGroup(
            panelheroeseliminadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelheroeseliminadosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );

        getContentPane().add(panelheroeseliminados, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 270, 260, 320));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/spiderman_resized_300x1000.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, 300, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        Click(0, 0);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        Click(0, 1);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        Click(0, 2);
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        Click(0, 3);
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        Click(0, 4);
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        Click(0, 5);
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        Click(0, 6);
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        Click(0, 7);
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        Click(0, 8);
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        Click(0, 9);
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
        Click(1, 0);
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
        Click(1, 1);
    }//GEN-LAST:event_b12ActionPerformed

    private void b13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b13ActionPerformed
        Click(1, 2);
    }//GEN-LAST:event_b13ActionPerformed

    private void b14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b14ActionPerformed
        Click(1, 3);
    }//GEN-LAST:event_b14ActionPerformed

    private void b15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b15ActionPerformed
        Click(1, 4);
    }//GEN-LAST:event_b15ActionPerformed

    private void b16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b16ActionPerformed
        Click(1, 5);
    }//GEN-LAST:event_b16ActionPerformed

    private void b17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b17ActionPerformed
        Click(1, 6);
    }//GEN-LAST:event_b17ActionPerformed

    private void b18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b18ActionPerformed
        Click(1, 7);
    }//GEN-LAST:event_b18ActionPerformed

    private void b19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b19ActionPerformed
        Click(1, 8);
    }//GEN-LAST:event_b19ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
        Click(1, 9);
    }//GEN-LAST:event_b20ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
        Click(2, 0);
    }//GEN-LAST:event_b21ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
        Click(2, 1);
    }//GEN-LAST:event_b22ActionPerformed

    private void b23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b23ActionPerformed
        Click(2, 2);
    }//GEN-LAST:event_b23ActionPerformed

    private void b24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b24ActionPerformed
        Click(2, 3);
    }//GEN-LAST:event_b24ActionPerformed

    private void b25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b25ActionPerformed
        Click(2, 4);
    }//GEN-LAST:event_b25ActionPerformed

    private void b26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b26ActionPerformed
        Click(2, 5);
    }//GEN-LAST:event_b26ActionPerformed

    private void b27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b27ActionPerformed
        Click(2, 6);
    }//GEN-LAST:event_b27ActionPerformed

    private void b28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b28ActionPerformed
        Click(2, 7);
    }//GEN-LAST:event_b28ActionPerformed

    private void b29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b29ActionPerformed
        Click(2, 8);
    }//GEN-LAST:event_b29ActionPerformed

    private void b30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b30ActionPerformed
        Click(2, 9);
    }//GEN-LAST:event_b30ActionPerformed

    private void b31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b31ActionPerformed
        Click(3, 0);
    }//GEN-LAST:event_b31ActionPerformed

    private void b32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b32ActionPerformed
        Click(3, 1);
    }//GEN-LAST:event_b32ActionPerformed

    private void b33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b33ActionPerformed
        Click(3, 2);
    }//GEN-LAST:event_b33ActionPerformed


    private void b34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b34ActionPerformed
        Click(3, 3);
    }//GEN-LAST:event_b34ActionPerformed

    private void b35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b35ActionPerformed
        Click(3, 4);
    }//GEN-LAST:event_b35ActionPerformed

    private void b36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b36ActionPerformed
        Click(3, 5);
    }//GEN-LAST:event_b36ActionPerformed

    private void b37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b37ActionPerformed
        Click(3, 6);
    }//GEN-LAST:event_b37ActionPerformed

    private void b38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b38ActionPerformed
        Click(3, 7);
    }//GEN-LAST:event_b38ActionPerformed

    private void b39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b39ActionPerformed
        Click(3, 8);
    }//GEN-LAST:event_b39ActionPerformed

    private void b40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b40ActionPerformed
        Click(3, 9);
    }//GEN-LAST:event_b40ActionPerformed

    private void b41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b41ActionPerformed
        Click(4, 0);
    }//GEN-LAST:event_b41ActionPerformed

    private void b42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b42ActionPerformed
        Click(4, 1);
    }//GEN-LAST:event_b42ActionPerformed

    private void b43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b43ActionPerformed
        Click(4, 2);
    }//GEN-LAST:event_b43ActionPerformed

    private void b44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b44ActionPerformed
        Click(4, 3);
    }//GEN-LAST:event_b44ActionPerformed

    private void b45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b45ActionPerformed
        Click(4, 4);
    }//GEN-LAST:event_b45ActionPerformed

    private void b46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b46ActionPerformed
        Click(4, 5);
    }//GEN-LAST:event_b46ActionPerformed

    private void b47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b47ActionPerformed
        Click(4, 6);
    }//GEN-LAST:event_b47ActionPerformed

    private void b48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b48ActionPerformed
        Click(4, 7);
    }//GEN-LAST:event_b48ActionPerformed

    private void b49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b49ActionPerformed
        Click(4, 8);
    }//GEN-LAST:event_b49ActionPerformed

    private void b50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b50ActionPerformed
        Click(4, 9);
    }//GEN-LAST:event_b50ActionPerformed

    private void b51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b51ActionPerformed
        Click(5, 0);
    }//GEN-LAST:event_b51ActionPerformed

    private void b52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b52ActionPerformed
        Click(5, 1);
    }//GEN-LAST:event_b52ActionPerformed

    private void b53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b53ActionPerformed
        Click(5, 2);
    }//GEN-LAST:event_b53ActionPerformed

    private void b54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b54ActionPerformed
        Click(5, 3);
    }//GEN-LAST:event_b54ActionPerformed

    private void b55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b55ActionPerformed
        Click(5, 4);
    }//GEN-LAST:event_b55ActionPerformed

    private void b56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b56ActionPerformed
        Click(5, 5);
    }//GEN-LAST:event_b56ActionPerformed

    private void b57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b57ActionPerformed
        Click(5, 6);
    }//GEN-LAST:event_b57ActionPerformed

    private void b58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b58ActionPerformed
        Click(5, 7);
    }//GEN-LAST:event_b58ActionPerformed

    private void b59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b59ActionPerformed
        Click(5, 8);
    }//GEN-LAST:event_b59ActionPerformed

    private void b60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b60ActionPerformed
        Click(5, 9);
    }//GEN-LAST:event_b60ActionPerformed

    private void b61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b61ActionPerformed
        Click(6, 0);
    }//GEN-LAST:event_b61ActionPerformed

    private void b62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b62ActionPerformed
        Click(6, 1);
    }//GEN-LAST:event_b62ActionPerformed

    private void b63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b63ActionPerformed
        Click(6, 2);
    }//GEN-LAST:event_b63ActionPerformed

    private void b64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b64ActionPerformed
        Click(6, 3);
    }//GEN-LAST:event_b64ActionPerformed

    private void b65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b65ActionPerformed
        Click(6, 4);
    }//GEN-LAST:event_b65ActionPerformed

    private void b66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b66ActionPerformed
        Click(6, 5);
    }//GEN-LAST:event_b66ActionPerformed

    private void b67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b67ActionPerformed
        Click(6, 6);
    }//GEN-LAST:event_b67ActionPerformed

    private void b68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b68ActionPerformed
        Click(6, 7);
    }//GEN-LAST:event_b68ActionPerformed

    private void b69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b69ActionPerformed
        Click(6, 8);
    }//GEN-LAST:event_b69ActionPerformed

    private void b70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b70ActionPerformed
        Click(6, 9);
    }//GEN-LAST:event_b70ActionPerformed

    private void b71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b71ActionPerformed
        Click(7, 0);
    }//GEN-LAST:event_b71ActionPerformed

    private void b72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b72ActionPerformed
        Click(7, 1);
    }//GEN-LAST:event_b72ActionPerformed

    private void b73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b73ActionPerformed
        Click(7, 2);
    }//GEN-LAST:event_b73ActionPerformed

    private void b74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b74ActionPerformed
        Click(7, 3);
    }//GEN-LAST:event_b74ActionPerformed

    private void b75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b75ActionPerformed
        Click(7, 4);
    }//GEN-LAST:event_b75ActionPerformed

    private void b76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b76ActionPerformed
        Click(7, 5);
    }//GEN-LAST:event_b76ActionPerformed

    private void b77ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b77ActionPerformed
        Click(7, 6);
    }//GEN-LAST:event_b77ActionPerformed

    private void b78ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b78ActionPerformed
        Click(7, 7);
    }//GEN-LAST:event_b78ActionPerformed

    private void b79ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b79ActionPerformed
        Click(7, 8);
    }//GEN-LAST:event_b79ActionPerformed

    private void b80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b80ActionPerformed
        Click(7, 9);
    }//GEN-LAST:event_b80ActionPerformed

    private void b81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b81ActionPerformed
        Click(8, 0);
    }//GEN-LAST:event_b81ActionPerformed

    private void b82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b82ActionPerformed
        Click(8, 1);
    }//GEN-LAST:event_b82ActionPerformed

    private void b83ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b83ActionPerformed
        Click(8, 2);
    }//GEN-LAST:event_b83ActionPerformed

    private void b84ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b84ActionPerformed
        Click(8, 3);
    }//GEN-LAST:event_b84ActionPerformed

    private void b85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b85ActionPerformed
        Click(8, 4);
    }//GEN-LAST:event_b85ActionPerformed

    private void b86ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b86ActionPerformed
        Click(8, 5);
    }//GEN-LAST:event_b86ActionPerformed

    private void b87ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b87ActionPerformed
        Click(8, 6);
    }//GEN-LAST:event_b87ActionPerformed

    private void b88ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b88ActionPerformed
        Click(8, 7);
    }//GEN-LAST:event_b88ActionPerformed

    private void b89ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b89ActionPerformed
        Click(8, 8);
    }//GEN-LAST:event_b89ActionPerformed

    private void b90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b90ActionPerformed
        Click(8, 9);
    }//GEN-LAST:event_b90ActionPerformed

    private void b91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b91ActionPerformed
        Click(9, 0);
    }//GEN-LAST:event_b91ActionPerformed

    private void b92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b92ActionPerformed
        Click(9, 1);
    }//GEN-LAST:event_b92ActionPerformed

    private void b93ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b93ActionPerformed
        Click(9, 2);
    }//GEN-LAST:event_b93ActionPerformed

    private void b94ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b94ActionPerformed
        Click(9, 3);
    }//GEN-LAST:event_b94ActionPerformed

    private void b95ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b95ActionPerformed
        Click(9, 4);
    }//GEN-LAST:event_b95ActionPerformed

    private void b96ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b96ActionPerformed
        Click(9, 5);
    }//GEN-LAST:event_b96ActionPerformed

    private void b97ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b97ActionPerformed
        Click(9, 6);
    }//GEN-LAST:event_b97ActionPerformed

    private void b98ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b98ActionPerformed
        Click(9, 7);
    }//GEN-LAST:event_b98ActionPerformed

    private void b99ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b99ActionPerformed
        Click(9, 8);
    }//GEN-LAST:event_b99ActionPerformed

    private void b100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b100ActionPerformed
        Click(9, 9);
    }//GEN-LAST:event_b100ActionPerformed
    private ImageIcon Cambiartamano(ImageIcon icono, int ancho, int alto) {
        Image img = icono.getImage();
        Image imgmod = img.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH);
        return new ImageIcon(imgmod);
    }

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
            java.util.logging.Logger.getLogger(ProyectoStratego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoStratego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoStratego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoStratego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoStratego().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelheroeseliminados;
    private javax.swing.JPanel panelvillanoseliminados;
    // End of variables declaration//GEN-END:variables

}
