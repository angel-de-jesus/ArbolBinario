package arbolbinario;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.util.Stack;
import java.util.regex.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class View extends javax.swing.JFrame {
    String principal = "principal";
    String [] array;
    int at;
    Stack pila = new Stack();
    int cont=0;
    int indexR=0,index0=0,index1=0,index2=0,index3=0,index4=0,index5=0;
    int cantidadHijos;
    int valor;
    int raiz;
    int decendienteD;
    int auxCantidadHijos;
    
    String derecha = "derecha";
    String izquierda = "izquierda";
    String posicion = "";
    
    int []arrayValor;
    int []arrayDecendiente;
    String []arrayPosicion;
    int a,b,c;
    
    public View() {
        initComponents();
        sintaxis.setVisible(false);
        lexico.setVisible(false);
        semantico.setVisible(false);
        jSeparator1.setVisible(false);
        jSeparator2.setVisible(false);
        btnArbol.setVisible(false);
        btnNodo.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        entrada = new javax.swing.JTextField();
        titleinput = new javax.swing.JLabel();
        verificar = new javax.swing.JButton();
        derivaciones = new javax.swing.JLabel();
        lexico = new javax.swing.JLabel();
        sintaxis = new javax.swing.JLabel();
        semantico = new javax.swing.JLabel();
        lexicoStatus = new javax.swing.JLabel();
        sistaxisStatus = new javax.swing.JLabel();
        semanticoStatus = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblResultado = new javax.swing.JLabel();
        btnNodo = new javax.swing.JButton();
        btnArbol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 153, 153));
        title.setText("ARBOL BINARIO");

        entrada.setBackground(new java.awt.Color(204, 255, 255));
        entrada.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        entrada.setMaximumSize(new java.awt.Dimension(2, 16));
        entrada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputColor(evt);
            }
        });

        titleinput.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        titleinput.setText("Escriba su entrada:");

        verificar.setBackground(new java.awt.Color(0, 153, 153));
        verificar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verificar.setForeground(new java.awt.Color(255, 255, 255));
        verificar.setBorder(null);
        verificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verificar.setLabel("Crear");
        verificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verificarMouseClicked(evt);
            }
        });

        lexico.setBackground(new java.awt.Color(255, 255, 255));
        lexico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lexico.setText("Lexico:");

        sintaxis.setBackground(new java.awt.Color(255, 255, 255));
        sintaxis.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sintaxis.setText("Sintaxis:");

        semantico.setBackground(new java.awt.Color(255, 255, 255));
        semantico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        semantico.setText("Semantico:");

        lexicoStatus.setBackground(new java.awt.Color(255, 255, 255));
        lexicoStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        sistaxisStatus.setBackground(new java.awt.Color(255, 255, 255));
        sistaxisStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        semanticoStatus.setBackground(new java.awt.Color(255, 255, 255));
        semanticoStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 153, 153));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblResultado.setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N

        btnNodo.setBackground(new java.awt.Color(255, 255, 255));
        btnNodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnNodo.setText("Nodo.java");
        btnNodo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnNodo.setContentAreaFilled(false);
        btnNodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btbNodo(evt);
            }
        });

        btnArbol.setBackground(new java.awt.Color(255, 255, 255));
        btnArbol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btnArbol.setText("Arbol.java");
        btnArbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        btnArbol.setContentAreaFilled(false);
        btnArbol.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnArbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnArbol(evt);
            }
        });

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(derivaciones)
                            .addGroup(fondoLayout.createSequentialGroup()
                                .addComponent(lexico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lexicoStatus)
                                .addGap(150, 150, 150)
                                .addComponent(sintaxis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sistaxisStatus)
                                .addGap(145, 145, 145)
                                .addComponent(semantico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(semanticoStatus))))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(title))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(titleinput)
                            .addComponent(entrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(verificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addComponent(lblResultado))
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(btnNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(btnArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(245, 245, 245))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(titleinput)
                .addGap(1, 1, 1)
                .addComponent(entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(verificar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lexico)
                    .addComponent(lexicoStatus)
                    .addComponent(sintaxis)
                    .addComponent(sistaxisStatus)
                    .addComponent(semantico)
                    .addComponent(semanticoStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(lblResultado)
                .addGap(42, 42, 42)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArbol, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNodo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(322, 322, 322)
                .addComponent(derivaciones))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verificarMouseClicked
        jSeparator1.setVisible(true);
        jSeparator2.setVisible(true);
        arrayPosicion = new String[0];
        arrayDecendiente = new int[0];
        arrayValor = new int[0];
        a=0;b=0;c=0;
        String cadena = entrada.getText();
        array = new String[0];
        array = cadena.split(" ");
        at=array.length;
        pila = new Stack(); 
        cont=0;
        cantidadHijos = 0;
        valor = 0;
        raiz = 0;
        decendienteD = 0;
        auxCantidadHijos=0;
        
        if(cadena.equals("")){
            JOptionPane.showMessageDialog(null,"digite una entrada");
        }else{
            Boolean aux = lexico();
            if(aux==true){
                lexico.setVisible(true);
                lexicoStatus.setForeground(Color.BLUE);
                lexicoStatus.setText("aceptada");
                lexico.setForeground(Color.GREEN);
                System.out.println("Entrada-> "+cadena);
                inicializarPila();  
            }else{
                lexico.setVisible(true);
                lexicoStatus.setForeground(Color.BLUE);
                lexicoStatus.setText("error");
                lexico.setForeground(Color.red);
                System.out.print("Error de lexico");
                lblResultado.setText("Entrada Invalida");
            }   
        } 
    }//GEN-LAST:event_verificarMouseClicked
    public Boolean lexico(){
        Boolean ban = false;
        Pattern entero = Pattern.compile("[0-9]*"); 
        Pattern agrupacion = Pattern.compile("[{]|[}]");
        Pattern simbolo = Pattern.compile("=|,|;|:");
        Pattern reservada = Pattern.compile("raiz|cantidadHijos|decendienteD|hijos|derecha|izquierda|valor|posicion");
        for(int i=0; i<array.length; i++){
            Matcher enteroP = entero.matcher(array[i]);
            Matcher agrupacionP = agrupacion.matcher(array[i]);
            Matcher simboloP = simbolo.matcher(array[i]);
            Matcher reservadaP = reservada.matcher(array[i]);
            if(enteroP.matches()){
                ban = true;
            } else if(agrupacionP.matches()){
                ban=true;
            } else if(simboloP.matches()){
                ban = true;
            }else if(reservadaP.matches()){
                ban=true;
            }else{
                ban=false;
            }
        }
        return ban;
    }
    private void inputColor(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputColor
        entrada.setCaretColor(Color.RED);
        entrada.setBackground(Color.white);
        entrada.setSelectionColor(Color.RED);
        entrada.setForeground(Color.DARK_GRAY);
        
    }//GEN-LAST:event_inputColor

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        lexico.setVisible(false);
        sintaxis.setVisible(false);
        semantico.setVisible(false);
        jSeparator1.setVisible(false);
        jSeparator2.setVisible(false);
        lexicoStatus.setText("");
        sistaxisStatus.setText("");
        semanticoStatus.setText("");
        entrada.setText("");
        lblResultado.setText("");
        btnArbol.setVisible(false);
        btnNodo.setVisible(false);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btbNodo(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btbNodo
        javax.swing.JFileChooser jF1= new javax.swing.JFileChooser();
        String ruta = "";
        try{
            if(jF1.showSaveDialog(null)==jF1.APPROVE_OPTION){
                ruta = jF1.getSelectedFile().getCanonicalPath();
                try {
                    String contenido = "public class Nodo{\n" +
                                "    private int dato;\n" +
                                "    private Nodo izq;\n" +
                                "    private Nodo der;\n" +
                                "\n" +
                                "    public Nodo(int dato){\n" +
                                "        this.dato = dato;\n" +
                                "    }\n" +
                                "\n" +
                                "    public Nodo getNodoIzquierdo(){\n" +
                                "        return izq;\n" +
                                "    }\n" +
                                "\n" +
                                "    public Nodo getNodoDerecho(){\n" +
                                "        return der;\n" +
                                "    }\n" +
                                "\n" +
                                "    public void setNodoDerecho(Nodo nodo){\n" +
                                "        der = nodo;\n" +
                                "    }\n" +
                                "\n" +
                                "    public void setNodoIzquierdo(Nodo nodo){\n" +
                                "        izq = nodo;\n" +
                                "    }\n" +
                                "\n" +
                                "    public int getDato(){\n" +
                                "        return dato;\n" +
                                "    }\n" +
                                "}";
                    File file = new File(ruta);
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(contenido);
                    bw.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(null,"Archivo Guardado");  
        }catch (Exception ex){
            ex.printStackTrace();
        }
             
    }//GEN-LAST:event_btbNodo

    private void btnArbol(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArbol
        
        javax.swing.JFileChooser jF1= new javax.swing.JFileChooser();
        String ruta = "";
        try{
            if(jF1.showSaveDialog(null)==jF1.APPROVE_OPTION){
                ruta = jF1.getSelectedFile().getCanonicalPath();
                try {
                    if(cantidadHijos==1){
                    String contenido = "public class Arbol {\n" +
                                        "    public static void main(String[]args){\n" +
                                        "        Nodo principal = new Nodo(5);\n" +
                                        "        Nodo hijo1 = new Nodo(6);\n" +
                                        "\n" +
                                        "        principal.setNodoDerecho(hijo1);\n" +
                                        "\n" +
                                        "        \n" +
                                        "        System.out.println(\"preOrden: \");\n" +
                                        "        preOrden(principal);\n" +
                                        "        System.out.println(\"\\ninOrden:\");\n" +
                                        "        inOrden(principal);\n" +
                                        "        System.out.println(\"\\npostOrden:\");\n" +
                                        "        postOrden(principal);\n" +
                                        "    }\n" +
                                        "    public static void preOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            preOrden(principal.getNodoIzquierdo());\n" +
                                        "            preOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void inOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            inOrden(principal.getNodoIzquierdo());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            inOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void postOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            postOrden(principal.getNodoIzquierdo());\n" +
                                        "            postOrden(principal.getNodoDerecho());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "\n" +
                                        "\n" +
                                        "}";
                    
                    File file = new File(ruta);
                    FileWriter fw = new FileWriter(file);
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write(contenido);
                    bw.close();
                    }else if(cantidadHijos==2){
                                        String contenido = "public class Arbol {\n" +
                                        "    public static void main(String[]args){\n" +
                                        "        Nodo principal = new Nodo(5);\n" +
                                        "        Nodo hijo1 = new Nodo(6);\n" +
                                        "        Nodo hijo2 = new Nodo(4);\n" +
                                        "\n" +
                                        "        principal.setNodoDerecho(hijo1);\n" +
                                        "        principal.setNodoIzquierdo(hijo2);\n" +
                                        "\n" +
                                        "        \n" +
                                        "        System.out.println(\"preOrden: \");\n" +
                                        "        preOrden(principal);\n" +
                                        "        System.out.println(\"\\ninOrden:\");\n" +
                                        "        inOrden(principal);\n" +
                                        "        System.out.println(\"\\npostOrden:\");\n" +
                                        "        postOrden(principal);\n" +
                                        "    }\n" +
                                        "    public static void preOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            preOrden(principal.getNodoIzquierdo());\n" +
                                        "            preOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void inOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            inOrden(principal.getNodoIzquierdo());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            inOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void postOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            postOrden(principal.getNodoIzquierdo());\n" +
                                        "            postOrden(principal.getNodoDerecho());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "\n" +
                                        "\n" +
                                        "}";
                    
                        File file = new File(ruta);
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(contenido);
                        bw.close();   
                    }else if(cantidadHijos==3){
                        String contenido = "public class Arbol {\n" +
                                        "    public static void main(String[]args){\n" +
                                        "        Nodo principal = new Nodo(5);\n" +
                                        "        Nodo hijo1 = new Nodo(8);\n" +
                                        "        Nodo hijo2 = new Nodo(4);\n" +
                                        "        Nodo hijo3 = new Nodo(12);\n" +
                                        "\n" +
                                        "        principal.setNodoDerecho(hijo1);\n" +
                                        "        principal.setNodoIzquierdo(hijo2);\n" +
                                        "        hijo1.setNodoDerecho(hijo3);\n" +
                                        "\n" +
                                        "        \n" +
                                        "        System.out.println(\"preOrden: \");\n" +
                                        "        preOrden(principal);\n" +
                                        "        System.out.println(\"\\ninOrden:\");\n" +
                                        "        inOrden(principal);\n" +
                                        "        System.out.println(\"\\npostOrden:\");\n" +
                                        "        postOrden(principal);\n" +
                                        "    }\n" +
                                        "    public static void preOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            preOrden(principal.getNodoIzquierdo());\n" +
                                        "            preOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void inOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            inOrden(principal.getNodoIzquierdo());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            inOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void postOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            postOrden(principal.getNodoIzquierdo());\n" +
                                        "            postOrden(principal.getNodoDerecho());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "\n" +
                                        "\n" +
                                        "}";
                    
                        File file = new File(ruta);
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(contenido);
                        bw.close();   
                    }else if(cantidadHijos==4){
                        String contenido = "public class Arbol {\n" +
                                        "    public static void main(String[]args){\n" +
                                        "        Nodo principal = new Nodo(5);\n" +
                                        "        Nodo hijo1 = new Nodo(8);\n" +
                                        "        Nodo hijo2 = new Nodo(4);\n" +
                                        "        Nodo hijo3 = new Nodo(12);\n" +
                                        "        Nodo hijo4 = new Nodo(7);\n" +
                                        "\n" +
                                        "        principal.setNodoDerecho(hijo1);\n" +
                                        "        principal.setNodoIzquierdo(hijo2);\n" +
                                        "        hijo1.setNodoDerecho(hijo3);\n" +
                                        "        hijo1.setNodoIzquierdo(hijo4);\n" +
                                        "\n" +
                                        "        \n" +
                                        "        System.out.println(\"preOrden: \");\n" +
                                        "        preOrden(principal);\n" +
                                        "        System.out.println(\"\\ninOrden:\");\n" +
                                        "        inOrden(principal);\n" +
                                        "        System.out.println(\"\\npostOrden:\");\n" +
                                        "        postOrden(principal);\n" +
                                        "    }\n" +
                                        "    public static void preOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            preOrden(principal.getNodoIzquierdo());\n" +
                                        "            preOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void inOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            inOrden(principal.getNodoIzquierdo());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            inOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void postOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            postOrden(principal.getNodoIzquierdo());\n" +
                                        "            postOrden(principal.getNodoDerecho());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "\n" +
                                        "\n" +
                                        "}";
                    
                        File file = new File(ruta);
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(contenido);
                        bw.close(); 
                    }else if(cantidadHijos==5){
                        String contenido = "public class Arbol {\n" +
                                        "    public static void main(String[]args){\n" +
                                        "        Nodo principal = new Nodo(5);\n" +
                                        "        Nodo hijo1 = new Nodo(8);\n" +
                                        "        Nodo hijo2 = new Nodo(3);\n" +
                                        "        Nodo hijo3 = new Nodo(12);\n" +
                                        "        Nodo hijo4 = new Nodo(7);\n" +
                                        "        Nodo hijo5 = new Nodo(4);\n" +
                                        "\n" +
                                        "        principal.setNodoDerecho(hijo1);\n" +
                                        "        principal.setNodoIzquierdo(hijo2);\n" +
                                        "        hijo1.setNodoDerecho(hijo3);\n" +
                                        "        hijo1.setNodoIzquierdo(hijo4);\n" +
                                        "        hijo2.setNodoDerecho(hijo5);\n" +
                                        "\n" +
                                        "        \n" +
                                        "        System.out.println(\"preOrden: \");\n" +
                                        "        preOrden(principal);\n" +
                                        "        System.out.println(\"\\ninOrden:\");\n" +
                                        "        inOrden(principal);\n" +
                                        "        System.out.println(\"\\npostOrden:\");\n" +
                                        "        postOrden(principal);\n" +
                                        "    }\n" +
                                        "    public static void preOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            preOrden(principal.getNodoIzquierdo());\n" +
                                        "            preOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void inOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            inOrden(principal.getNodoIzquierdo());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            inOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void postOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            postOrden(principal.getNodoIzquierdo());\n" +
                                        "            postOrden(principal.getNodoDerecho());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "\n" +
                                        "\n" +
                                        "}";
                    
                        File file = new File(ruta);
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(contenido);
                        bw.close();
                    }else if(cantidadHijos==6){
                        String contenido = "public class Arbol {\n" +
                                        "    public static void main(String[]args){\n" +
                                        "        Nodo principal = new Nodo(5);\n" +
                                        "        Nodo hijo1 = new Nodo(8);\n" +
                                        "        Nodo hijo2 = new Nodo(3);\n" +
                                        "        Nodo hijo3 = new Nodo(12);\n" +
                                        "        Nodo hijo4 = new Nodo(7);\n" +
                                        "        Nodo hijo5 = new Nodo(4);\n" +
                                        "        Nodo hijo6 = new Nodo(2);\n" +
                                        "\n" +
                                        "        principal.setNodoDerecho(hijo1);\n" +
                                        "        principal.setNodoIzquierdo(hijo2);\n" +
                                        "        hijo1.setNodoDerecho(hijo3);\n" +
                                        "        hijo1.setNodoIzquierdo(hijo4);\n" +
                                        "        hijo2.setNodoDerecho(hijo5);\n" +
                                        "        hijo2.setNodoIzquierdo(hijo6);\n" +
                                        "\n" +
                                        "        \n" +
                                        "        System.out.println(\"preOrden: \");\n" +
                                        "        preOrden(principal);\n" +
                                        "        System.out.println(\"\\ninOrden:\");\n" +
                                        "        inOrden(principal);\n" +
                                        "        System.out.println(\"\\npostOrden:\");\n" +
                                        "        postOrden(principal);\n" +
                                        "    }\n" +
                                        "    public static void preOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            preOrden(principal.getNodoIzquierdo());\n" +
                                        "            preOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void inOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            inOrden(principal.getNodoIzquierdo());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "            inOrden(principal.getNodoDerecho());\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "    public static void postOrden(Nodo principal){\n" +
                                        "        if(principal!=null){\n" +
                                        "            postOrden(principal.getNodoIzquierdo());\n" +
                                        "            postOrden(principal.getNodoDerecho());\n" +
                                        "            System.out.print(principal.getDato()+\"-\");\n" +
                                        "        }\n" +
                                        "        \n" +
                                        "    }\n" +
                                        "\n" +
                                        "\n" +
                                        "}";
                    
                        File file = new File(ruta);
                        FileWriter fw = new FileWriter(file);
                        BufferedWriter bw = new BufferedWriter(fw);
                        bw.write(contenido);
                        bw.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            JOptionPane.showMessageDialog(null,"Archivo Guardado");  
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnArbol
    public void inicializarPila(){
        pila.push("$");
        if(array[cont].equals("raiz")){
            pila.push("<hijos>");
            pila.push(";");
            pila.push("<numero>");
            pila.push("=");
            pila.push("cantidadHijos");
            pila.push(";");
            pila.push("<principal>");
            pila.push("<numero>");
            pila.push("=");
            pila.push("raiz");
            cont++;
            principal();
        }else{
            sintaxis.setVisible(true);
            sintaxis.setForeground(Color.RED);
            sistaxisStatus.setForeground(Color.BLUE);
            sistaxisStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
        }

    }
    public void principal(){
        if(cont<at){
            if(array[cont].equals("=")){
                cont++;
                numero();
                raiz = Integer.parseInt((String)pila.peek());
                System.out.print("raiz: "+raiz);
                if(cont<at){
                    puntoComa();
                    cantidadHijos();
                }  
            }else{
                sintaxis.setVisible(true);
                sintaxis.setForeground(Color.RED);
                sistaxisStatus.setForeground(Color.BLUE);
                sistaxisStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
            }
        }
    }
    public void cantidadHijos(){
        if(cont<at){
            if(array[cont].equals("cantidadHijos")){
                cont++;
                if(cont<at){
                    if(array[cont].equals("=")){
                        cont++;
                        numero();
                        cantidadHijos = Integer.parseInt((String)pila.peek());
                        arrayValor =  new int [cantidadHijos];
                        arrayDecendiente =  new int [cantidadHijos];
                        arrayPosicion = new String [cantidadHijos];
                        System.out.println("Hijos: "+cantidadHijos);
                        if(cont<at){
                            puntoComa();
                            hijos();
                        }
                    }else{
                        sintaxis.setVisible(true);
                        sintaxis.setForeground(Color.RED);
                        sistaxisStatus.setForeground(Color.BLUE);
                        sistaxisStatus.setText("error");
                        lblResultado.setText("Entrada Invalida");
                    }
                }
            }else{
                sintaxis.setVisible(true);
                sintaxis.setForeground(Color.RED);
                sistaxisStatus.setForeground(Color.BLUE);
                sistaxisStatus.setText("error"); 
                lblResultado.setText("Entrada Invalida");
            }
        }
    }
    public void hijos(){
        if(cont<at){
            if(array[cont].equals("hijos")){ 
                auxCantidadHijos++;
                auxCantidadHijos = auxCantidadHijos;
                pila.push("<complemento>");
                pila.push("}");
                pila.push(";");
                pila.push("<numero>");
                pila.push(":");
                pila.push("valor");
                pila.push(";");
                pila.push("<posición>");
                pila.push(":");
                pila.push("ubicacion");
                pila.push(":");
                pila.push("<numero>");
                pila.push(":");
                pila.push("decendienteD");
                pila.push("{");
                pila.push("hijos");
                cont++;
                if(cont<at){
                    if(array[cont].equals("{")){
                        cont++;
                        decendiente();
                    }else{
                        sintaxis.setVisible(true);
                        sintaxis.setForeground(Color.RED);
                        sistaxisStatus.setForeground(Color.BLUE);
                        sistaxisStatus.setText("error");
                        lblResultado.setText("Entrada Invalida");
                    }
                }
            }else{
                sintaxis.setVisible(true);
                sintaxis.setForeground(Color.RED);
                sistaxisStatus.setForeground(Color.BLUE);
                sistaxisStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
            }
        }
    }
    public void decendiente(){
  
        if(cont<at){
            if(array[cont].equals("decendienteD")){
                cont++;
                if(cont<at){
                    if(array[cont].equals(":")){
                        cont++;
                        numero();
                        decendienteD=Integer.parseInt((String)pila.peek());
                        if(a<cantidadHijos){
                            arrayDecendiente[a]=decendienteD;
                            a++;
                        }
                        if(cont<at){
                            puntoComa();
                            ubicacion();
                            
                        }
                    }else{
                        sintaxis.setVisible(true);
                        sintaxis.setForeground(Color.RED);
                        sistaxisStatus.setForeground(Color.BLUE);
                        sistaxisStatus.setText("error");
                        lblResultado.setText("Entrada Invalida");
                    }
                }
            }else{
                sintaxis.setVisible(true);
                sintaxis.setForeground(Color.RED);
                sistaxisStatus.setForeground(Color.BLUE);
                sistaxisStatus.setText("error"); 
                lblResultado.setText("Entrada Invalida");
            }
        }
    }
    public void ubicacion(){ 
        if(cont<at){
            if(array[cont].equals("posicion")){
                cont++;
                if(cont<at){
                    if(array[cont].equals(":")){
                        cont++;
                        posicion();
                        puntoComa();
                        valor();
                        //raiz = 2 ; cantidadHijos = 2 ; hijos { decendienteD : 2 ; posicion : derecha ; valor : 3 ; } , hijos { decendienteD : 2 ; posicion : izquierda ; valor : 1 ; }
                    }else{
                        sintaxis.setVisible(true);
                        sintaxis.setForeground(Color.RED);
                        sistaxisStatus.setForeground(Color.BLUE);
                        sistaxisStatus.setText("error");
                        lblResultado.setText("Entrada Invalida");
                    }
                }
            }else{
                sintaxis.setVisible(true);
                sintaxis.setForeground(Color.RED);
                sistaxisStatus.setForeground(Color.BLUE);
                sistaxisStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
            }
        }
    }
    public void valor(){
        if(cont<at){
            if(array[cont].equals("valor")){
                cont++;
                if(cont<at){
                    if(array[cont].equals(":")){
                        cont++;
                        numero();
                        valor =Integer.parseInt((String)pila.peek());
                        if(c<cantidadHijos){
                            arrayValor[c]=valor;
                            c++;
                        }
                        puntoComa();
                        if(cont<at){
                            if(array[cont].equals("}")){
                                cont = cont + 1;
                                if(cont==at){
                                    sintaxis.setVisible(true);
                                    sintaxis.setForeground(Color.GREEN);
                                    sistaxisStatus.setForeground(Color.BLUE);
                                    sistaxisStatus.setText("aceptada");
                                    System.out.println("cadena aceptada");
                                    semantico();
                                    System.out.println("******"+cont+"****"+at);
                                    
                                }else{
                                    complemento();
                                    System.out.println("******"+cont+"****"+at);
                                }
                            }else{
                                sintaxis.setVisible(true);
                                sintaxis.setForeground(Color.RED);
                                sistaxisStatus.setForeground(Color.BLUE);
                                sistaxisStatus.setText("error");
                                lblResultado.setText("Entrada Invalida");
                            }
                        }
                    }else{
                        sintaxis.setVisible(true);
                        sintaxis.setForeground(Color.RED);
                        sistaxisStatus.setForeground(Color.BLUE);
                        sistaxisStatus.setText("error");
                        lblResultado.setText("Entrada Invalida");
                    }
                }
            }else{
                sintaxis.setVisible(true);
                sintaxis.setForeground(Color.RED);
                sistaxisStatus.setForeground(Color.BLUE);
                sistaxisStatus.setText("error"); 
                lblResultado.setText("Entrada Invalida");
            }
        }
    }
    public void complemento(){
        if(cont<at){
            if(array[cont].equals(",")){
                pila.pop();
                pila.push("<hijos>");
                pila.push(",");
                cont++;
                hijos();
            }else{
                sintaxis.setVisible(true);
                sintaxis.setForeground(Color.RED);
                sistaxisStatus.setForeground(Color.BLUE);
                sistaxisStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
            }
        }
    }
    public void puntoComa(){
        if(array[cont].equals(";")){
            cont++;
        }else{
            sintaxis.setVisible(true);
            sintaxis.setForeground(Color.RED);
            sistaxisStatus.setForeground(Color.BLUE);
            sistaxisStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
        }
    }
    public void numero(){
        Pattern cadena = Pattern.compile("[0-9]*"); 
        if(cont<at){
            Matcher matcher = cadena.matcher(array[cont]);
            if(matcher.matches()){
                pila.push("<restoD>");
                pila.push(array[cont]);
                cont++;
            }else{
                sintaxis.setVisible(true);
                sintaxis.setForeground(Color.RED);
                sistaxisStatus.setForeground(Color.BLUE);
                sistaxisStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                System.out.println("error: "+array[cont]);
            }
        }
    }
    public void posicion(){
        Pattern cadena = Pattern.compile("derecha|izquierda");
        Matcher matcher = cadena.matcher(array[cont]);
        if(matcher.matches()){
            pila.push(array[cont]);
            posicion=(String)pila.peek();
            if(b<cantidadHijos){
                arrayPosicion[b]=posicion;
                b++;
            }
            cont++;
        }else{
            sintaxis.setVisible(true);
            sintaxis.setForeground(Color.RED);
            sistaxisStatus.setForeground(Color.BLUE);
            sistaxisStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            System.out.println("error: "+array[cont]);
        }
    }
    
    public void semantico(){
        int aux=0;
        int index=1;
        if(cantidadHijos == auxCantidadHijos){
            if(cantidadHijos==1){
                if(arrayDecendiente[aux]==raiz){
                    if(arrayPosicion[aux].equals(derecha)){
                        if(arrayValor[aux]>raiz){
                            
                            semantico.setVisible(true);
                            semantico.setForeground(Color.GREEN);
                            semanticoStatus.setForeground(Color.BLUE);
                            semanticoStatus.setText("aceptada");  
                            lblResultado.setText("Entrada Valida");
                            btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                        }else{
                            semantico.setVisible(true);
                            semantico.setForeground(Color.red);
                            semanticoStatus.setForeground(Color.BLUE);
                            semanticoStatus.setText("error");
                            lblResultado.setText("Entrada Invalida");
                            JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que la raiz");                
                        }
                    }else if(arrayPosicion[aux].equals(izquierda)){
                        if(arrayValor[aux]<raiz){
                            semantico.setVisible(true);
                            semantico.setForeground(Color.GREEN);
                            semanticoStatus.setForeground(Color.BLUE);
                            semanticoStatus.setText("aceptada");  
                            lblResultado.setText("Entrada Valida");
                            btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                        }else{
                            semantico.setVisible(true);
                            semantico.setForeground(Color.red);
                            semanticoStatus.setForeground(Color.BLUE);
                            semanticoStatus.setText("error");
                            lblResultado.setText("Entrada Invalida");
                            JOptionPane.showMessageDialog(null,"la posicion del hijo: #"+index+" es incorrecto");                
                        }
                    }else{
                        semantico.setVisible(true);
                        semantico.setForeground(Color.red);
                        semanticoStatus.setForeground(Color.BLUE);
                        semanticoStatus.setText("error");
                        lblResultado.setText("Entrada Invalida");
                        JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
                    }
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del que deciende el hijo: #"+index+" no existe");
                }
            }else if(cantidadHijos==2){
                cHijos2(index);
            }else if(cantidadHijos==3){
                cHijos3(index);
            }else if(cantidadHijos==4){
                cHijos3(index);
            }else if(cantidadHijos==5){
                cHijos3(index);
            }else if(cantidadHijos==6){
                cHijos3(index);
            }
        }else{
            semantico.setVisible(true);
            semantico.setForeground(Color.red);
            semanticoStatus.setForeground(Color.BLUE);
            semanticoStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            JOptionPane.showMessageDialog(null,"la cantidad de hijos declarados no coniciden con las creadas");
        }
    }
    public void cHijos6(int aux,int index){
        if(arrayDecendiente[aux]==raiz){
            if(indexR==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender de la raiz"); 
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                    btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que la raiz");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                    btnNodo.setVisible(true);

                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"la posicion del hijo: #"+index+" es incorrecto");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else
        if(arrayDecendiente[aux]==arrayValor[0]){
            if(index0==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender del hijo: #"+arrayValor[0]);
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                    btnNodo.setVisible(true);

                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                  
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                    btnNodo.setVisible(true);

                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser menor que su padre");                   
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[1]){
            if(index1==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender del hijo: #"+arrayValor[1]);
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[1]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                    btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[1]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[2]){
            if(index2==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender del hijo: #"+arrayValor[2]);
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[2]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[2]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[3]){
            if(index3==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender del hijo: #"+arrayValor[3]);
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[3]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[3]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }  
        }else if(arrayDecendiente[aux]==arrayValor[4]){
            if(index4==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender del hijo: #"+arrayValor[3]);
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[4]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[4]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }  
        }else if(arrayDecendiente[aux]==arrayValor[5]){
            if(index5==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender del hijo: #"+arrayValor[3]);
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[5]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[5]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else{
            semantico.setVisible(true);
            semantico.setForeground(Color.red);
            semanticoStatus.setForeground(Color.BLUE);
            semanticoStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            JOptionPane.showMessageDialog(null,"el valor del que deciende el hijo: #"+index+" no existe");
        }   
    }
    public void cHijos5(int aux,int index){
        if(arrayDecendiente[aux]==raiz){
            if(indexR==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender de la raiz"); 
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");  
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    indexR=2;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que la raiz");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index2=2;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"la posicion del hijo: #"+index+" es incorrecto");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else
        if(arrayDecendiente[aux]==arrayValor[0]){
            if(index0==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender del hijo: #"+arrayValor[0]);
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index0++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    }   
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                  
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index0++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser menor que su padre");                   
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[1]){
            if(index1==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender del hijo: #"+arrayValor[0]);
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[1]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index1++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[1]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index1++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[2]){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[2]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index2++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[2]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index2++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[3]){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[3]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index3++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[3]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index3++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }  
        }else if(arrayDecendiente[aux]== arrayValor[4]){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[4]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index4++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[4]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index4++;
                    if(cantidadHijos>=6){
                        aux++;
                        index++;
                        cHijos6(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }  
        }else{
            semantico.setVisible(true);
            semantico.setForeground(Color.red);
            semanticoStatus.setForeground(Color.BLUE);
            semanticoStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            JOptionPane.showMessageDialog(null,"el valor del que deciende el hijo: #"+index+" no existe");
        }               
    }
    public void cHijos4(int aux,int index){
        if(arrayDecendiente[aux]==raiz){
            if(indexR==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender de la raiz"); 
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    indexR=2;
                    if(cantidadHijos>=5){
                        aux++;
                        index++;
                        cHijos5(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que la raiz");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index2=2;
                    if(cantidadHijos>=5){
                        aux++;
                        index++;
                        cHijos5(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"la posicion del hijo: #"+index+" es incorrecto");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else
        if(arrayDecendiente[aux]==arrayValor[0]){
            if(index0==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender del hijo: #"+arrayValor[0]);
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index0++;
                    if(cantidadHijos>=5){
                        aux++;
                        index++;
                        cHijos5(aux,index); 
                    }   
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                  
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index0++;
                    if(cantidadHijos>=5){
                        aux++;
                        index++;
                        cHijos5(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser menor que su padre");                   
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[1]){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[1]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index1++;
                    if(cantidadHijos>=5){
                        aux++;
                        index++;
                        cHijos5(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[1]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index1++;
                    if(cantidadHijos>=5){
                        aux++;
                        index++;
                        cHijos5(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[2]){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[2]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index2++;
                    if(cantidadHijos>=5){
                        aux++;
                        index++;
                        cHijos5(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[2]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index2++;
                    if(cantidadHijos>=5){
                        aux++;
                        index++;
                        cHijos5(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else{
            semantico.setVisible(true);
            semantico.setForeground(Color.red);
            semanticoStatus.setForeground(Color.BLUE);
            semanticoStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            JOptionPane.showMessageDialog(null,"el valor del que deciende el hijo: #"+index+" no existe");
        }        
    }

    public void cHijos2(int index){
        int aux=0;
        if(arrayDecendiente[aux]==raiz){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    indexR=1;
                    aux++;
                    index++;
                    c2(aux,index);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que la raiz");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    aux++;
                    index++;
                    c2(aux,index);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" deve ser menor a la raiz");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else{
            semantico.setVisible(true);
            semantico.setForeground(Color.red);
            semanticoStatus.setForeground(Color.BLUE);
            semanticoStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            JOptionPane.showMessageDialog(null,"el valor del que deciende el hijo: #"+index+" no existe");
        }
    }
    public void c2(int aux,int index){
        if(arrayDecendiente[aux]==raiz){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    indexR=2;
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que la raiz");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);

                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"la posicion del hijo: #"+index+" es incorrecto");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[0]){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");  
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    aux++;
                    index++;
                    index0=1;
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    aux++;
                    index++;
                  
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else{
            semantico.setVisible(true);
            semantico.setForeground(Color.red);
            semanticoStatus.setForeground(Color.BLUE);
            semanticoStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            JOptionPane.showMessageDialog(null,"el valor del que deciende el hijo: #"+index+" no existe");
        }    
    }
    public void cHijos3(int index){
        int aux=0;
        if(arrayDecendiente[aux]==raiz){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    aux++;
                    index++;
                    indexR=1;
                    c3(aux,index);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que la raiz");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    aux++;
                    index++;
                    indexR=1;
                    c3(aux,index);
                    
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" deve ser menor a la raiz");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else{
            semantico.setVisible(true);
            semantico.setForeground(Color.red);
            semanticoStatus.setForeground(Color.BLUE);
            semanticoStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            JOptionPane.showMessageDialog(null,"el valor del que deciende el hijo: #"+index+" no existe");
        }
    }
    public void c3(int aux, int index){
        if(arrayDecendiente[aux]==raiz){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");   
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    aux++;
                    index++;
                    indexR=2;
                    c31(aux,index);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que la raiz");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    aux++;
                    index++;
                    indexR=2;
                    c31(aux,index);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"la posicion del hijo: #"+index+" es incorrecto");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[0]){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    aux++;
                    index++;
                    index0=1;
                    c31(aux,index);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    aux++;
                    index++;
                    index0=1;
                    c31(aux,index);
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else{
            semantico.setVisible(true);
            semantico.setForeground(Color.red);
            semanticoStatus.setForeground(Color.BLUE);
            semanticoStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            JOptionPane.showMessageDialog(null,"el valor del que deciende el hijo: #"+index+" no existe");
        }    
    }
    public void c31(int aux, int index){
        
        if(arrayDecendiente[aux]==raiz){
            if(indexR==2){
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"el hijo: #"+index+" ya no puede decender de la raiz"); 
            }else
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    indexR=2;
                    if(cantidadHijos>=4){
                        aux++;
                        index++;
                        cHijos4(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que la raiz");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<raiz){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    indexR=2;
                    if(cantidadHijos>=4){
                        aux++;
                        index++;
                        cHijos4(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"la posicion del hijo: #"+index+" es incorrecto");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else
        if(arrayDecendiente[aux]==arrayValor[0]){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index0=2;
                    if(cantidadHijos>=4){
                        aux++;
                        index++;
                        cHijos4(aux,index); 
                    }   
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                  
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[0]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index0=2;
                    if(cantidadHijos>=4){
                       aux++;
                       index++;
                       cHijos4(aux,index); 
                    } 
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser menor que su padre");                   
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else if(arrayDecendiente[aux]==arrayValor[1]){
            if(arrayPosicion[aux].equals(derecha)){
                if(arrayValor[aux]>arrayValor[1]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada"); 
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index1=1;
                    if(cantidadHijos>=4){
                        aux++;
                        index++;
                        cHijos4(aux,index); 
                    }  
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: "+index+" debe ser mayor que su padre");                
                }
            }else if(arrayPosicion[aux].equals(izquierda)){
                if(arrayValor[aux]<arrayValor[1]){
                    semantico.setVisible(true);
                    semantico.setForeground(Color.GREEN);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("aceptada");
                    lblResultado.setText("Entrada Valida");
                    btnArbol.setVisible(true);
                            btnNodo.setVisible(true);
                    index1=1;
                    if(cantidadHijos>=4){
                        aux++;
                        index++;
                        cHijos4(aux,index); 
                    }  
                }else{
                    semantico.setVisible(true);
                    semantico.setForeground(Color.red);
                    semanticoStatus.setForeground(Color.BLUE);
                    semanticoStatus.setText("error");
                    lblResultado.setText("Entrada Invalida");
                    JOptionPane.showMessageDialog(null,"el valor del hijo: #"+index+" debe ser menor que su padre");                
                }
            }else{
                semantico.setVisible(true);
                semantico.setForeground(Color.red);
                semanticoStatus.setForeground(Color.BLUE);
                semanticoStatus.setText("error");
                lblResultado.setText("Entrada Invalida");
                JOptionPane.showMessageDialog(null,"la posicion del hijo: "+index+" no coincide con su valor");
            }
        }else{
            semantico.setVisible(true);
            semantico.setForeground(Color.red);
            semanticoStatus.setForeground(Color.BLUE);
            semanticoStatus.setText("error");
            lblResultado.setText("Entrada Invalida");
            JOptionPane.showMessageDialog(null,"el valor del que deciende el hijo: #"+index+" no existe");
        }    
    }
        
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbol;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnNodo;
    private javax.swing.JLabel derivaciones;
    private javax.swing.JTextField entrada;
    private javax.swing.JPanel fondo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lexico;
    private javax.swing.JLabel lexicoStatus;
    private javax.swing.JLabel semantico;
    private javax.swing.JLabel semanticoStatus;
    private javax.swing.JLabel sintaxis;
    private javax.swing.JLabel sistaxisStatus;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleinput;
    private javax.swing.JButton verificar;
    // End of variables declaration//GEN-END:variables
}
