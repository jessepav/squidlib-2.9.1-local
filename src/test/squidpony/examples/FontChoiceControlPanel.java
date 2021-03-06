package squidpony.examples;/*
 * FontChoiceControlPanel.java
 *
 * Created on Dec 5, 2009, 11:58:20 PM
 */
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import squidpony.SColorFactory;

/**
 *
 * @author Eben
 */
public class FontChoiceControlPanel extends javax.swing.JPanel {

    /**
     * Creates new form FontChoiceControlPanel
     */
    public FontChoiceControlPanel() {
        initComponents();
        initFontList();
    }

    /**
     * Allows the setting of the x and y values at construction time.
     *
     * @param gridHeight
     * @param gridWidth
     */
    public FontChoiceControlPanel(int gridWidth, int gridHeight) {
        initComponents();
        this.rows = gridHeight;
        this.columns = gridWidth;
        this.gridHeightField.setText(String.valueOf(gridHeight));
        this.gridWidthField.setText(String.valueOf(gridWidth));
        initFontList();
        validateFontSize();
    }

    private void initFontList() {
        //Get the local graphics environment
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();

        //Get the font names from the graphics environment
        Font[] fonts = ge.getAllFonts();

        fontComboBox.removeAllItems();
        LinkedList<String> set = new LinkedList<>();
        for (Font font : fonts) {
            String name = font.getFamily();
            if (!set.contains(name)) {
                set.add(name);
            }
        }
        Collections.sort(set);
        int arialLocation = 0;
        for (String s : set) {
            fontComboBox.addItem(s);
            if ("arial".equals(s.toLowerCase())) {
                arialLocation = set.indexOf(s);
            }
        }
        fontComboBox.setMaximumRowCount(8);
        fontComboBox.setSelectedItem(fontComboBox.getItemAt(arialLocation));
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The
     * content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        gridHeightField = new javax.swing.JTextField();
        cellHeightField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gridWidthField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cellWidthField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        topPaddingField = new javax.swing.JTextField();
        bottomPaddingField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        leftPaddingField = new javax.swing.JTextField();
        rightPaddingField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        startRangeField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        endRangeField = new javax.swing.JTextField();
        generateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputTextArea = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        fontComboBox = new javax.swing.JComboBox();
        fontSizeField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boldCheckBox = new javax.swing.JCheckBox();
        italicsCheckBox = new javax.swing.JCheckBox();
        antialiasBox = new javax.swing.JCheckBox();
        foregroundButton = new javax.swing.JButton();
        backgroundButton = new javax.swing.JButton();
        colorizeToggleButton = new javax.swing.JToggleButton();
        loadFontButton = new javax.swing.JButton();
        foreColorPanel = new javax.swing.JPanel();
        backColorPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        updateButton.setText("Update");

        gridHeightField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        gridHeightField.setText("16");
        gridHeightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridHeightFieldActionPerformed(evt);
            }
        });

        cellHeightField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cellHeightField.setText("16");
        cellHeightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellHeightFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("X");

        jLabel4.setText("Grid Size:");

        gridWidthField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        gridWidthField.setText("16");
        gridWidthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gridWidthFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("X");

        cellWidthField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cellWidthField.setText("16");
        cellWidthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellWidthFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Cell Size:");

        jLabel10.setText("Padding");

        topPaddingField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        topPaddingField.setText("0");
        topPaddingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topPaddingFieldActionPerformed(evt);
            }
        });

        bottomPaddingField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        bottomPaddingField.setText("0");
        bottomPaddingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomPaddingFieldActionPerformed(evt);
            }
        });

        leftPaddingField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        leftPaddingField.setText("0");
        leftPaddingField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftPaddingFieldActionPerformed(evt);
            }
        });

        rightPaddingField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        rightPaddingField.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(leftPaddingField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPaddingField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(leftPaddingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rightPaddingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(topPaddingField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bottomPaddingField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(topPaddingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomPaddingField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gridWidthField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gridHeightField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cellWidthField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cellHeightField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gridWidthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(gridHeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cellWidthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(cellHeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel8.setText("UTF-16 Range:");

        startRangeField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        startRangeField.setText("0x20");

        jLabel9.setText("to");

        endRangeField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        endRangeField.setText("0x7E");

        generateButton.setText("Generate");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        inputTextArea.setColumns(20);
        inputTextArea.setRows(5);
        jScrollPane1.setViewportView(inputTextArea);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(startRangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(endRangeField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(generateButton))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(startRangeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(endRangeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generateButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        fontComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        fontSizeField.setText("16");
        fontSizeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontSizeFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Font Size:");

        boldCheckBox.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        boldCheckBox.setSelected(true);
        boldCheckBox.setText("BOLD");

        italicsCheckBox.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        italicsCheckBox.setText("Italics");

        antialiasBox.setText("Antialias");

        foregroundButton.setText("Foreground");
        foregroundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foregroundButtonActionPerformed(evt);
            }
        });

        backgroundButton.setText("Background");
        backgroundButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backgroundButtonActionPerformed(evt);
            }
        });

        colorizeToggleButton.setSelected(true);
        colorizeToggleButton.setText("Random Colors");

        loadFontButton.setText("Load TTF");
        loadFontButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFontButtonActionPerformed(evt);
            }
        });

        foreColorPanel.setBackground(new java.awt.Color(255, 255, 235));
        foreColorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        foreColorPanel.setMinimumSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout foreColorPanelLayout = new javax.swing.GroupLayout(foreColorPanel);
        foreColorPanel.setLayout(foreColorPanelLayout);
        foreColorPanelLayout.setHorizontalGroup(
            foreColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        foreColorPanelLayout.setVerticalGroup(
            foreColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        backColorPanel.setBackground(new java.awt.Color(51, 0, 0));
        backColorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        backColorPanel.setMinimumSize(new java.awt.Dimension(24, 24));

        javax.swing.GroupLayout backColorPanelLayout = new javax.swing.GroupLayout(backColorPanel);
        backColorPanel.setLayout(backColorPanelLayout);
        backColorPanelLayout.setHorizontalGroup(
            backColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        backColorPanelLayout.setVerticalGroup(
            backColorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(foregroundButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(foreColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backgroundButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backColorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fontSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fontComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(boldCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(italicsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(antialiasBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadFontButton))
            .addComponent(colorizeToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fontSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fontComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boldCheckBox)
                    .addComponent(italicsCheckBox)
                    .addComponent(antialiasBox)
                    .addComponent(loadFontButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(backgroundButton, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(foregroundButton))
                    .addComponent(foreColorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backColorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorizeToggleButton))
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void gridWidthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridWidthFieldActionPerformed
        validateRow();
    }//GEN-LAST:event_gridWidthFieldActionPerformed

    private void gridHeightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gridHeightFieldActionPerformed
        validateColumn();
    }//GEN-LAST:event_gridHeightFieldActionPerformed

    private void validateRow() {
        try {
            int t = Integer.parseInt(gridHeightField.getText());
            rows = t;
        } catch (NumberFormatException n) {
            gridHeightField.setText("" + rows);
        }
    }

    private void validateColumn() {
        try {
            int t = Integer.parseInt(gridWidthField.getText());
            columns = t;
        } catch (NumberFormatException n) {
            gridWidthField.setText("" + columns);
        }
    }

    private void validateCellWidth() {
        try {
            int t = Integer.parseInt(cellWidthField.getText());
            cellWidth = t;
        } catch (NumberFormatException n) {
            cellWidthField.setText("" + cellWidth);
        }
    }

    private void validateCellHeight() {
        try {
            int t = Integer.parseInt(cellHeightField.getText());
            cellHeight = t;
        } catch (NumberFormatException n) {
            gridWidthField.setText("" + cellHeight);
        }
    }

    private void validateFontSize() {
        try {
            int t = Integer.parseInt(fontSizeField.getText());
            fontSize = t;
        } catch (NumberFormatException n) {
            fontSizeField.setText("" + fontSize);
        }
    }

    private void validateTopPad() {
        try {
            int t = Integer.parseInt(topPaddingField.getText());
            topPad = t;
        } catch (NumberFormatException n) {
            topPaddingField.setText("" + topPad);
        }
    }

    private void validateBottomPad() {
        try {
            int t = Integer.parseInt(bottomPaddingField.getText());
            bottomPad = t;
        } catch (NumberFormatException n) {
            bottomPaddingField.setText("" + bottomPad);
        }
    }

    private void validateLeftPad() {
        try {
            int t = Integer.parseInt(leftPaddingField.getText());
            leftPad = t;
        } catch (NumberFormatException n) {
            leftPaddingField.setText("" + leftPad);
        }
    }

    private void validateRightPad() {
        try {
            int t = Integer.parseInt(rightPaddingField.getText());
            rightPad = t;
        } catch (NumberFormatException n) {
            rightPaddingField.setText("" + rightPad);
        }
    }

    private void validateStartRange() {
        try {
            int t = Integer.parseInt(startRangeField.getText().substring(2), 16);//evaluate as a hex value
            startRange = t;
        } catch (NumberFormatException n) {
            startRangeField.setText("0x" + Integer.toHexString(startRange));
        }
    }

    private void validateEndRange() {
        try {
            int t = Integer.parseInt(endRangeField.getText().substring(2), 16);//evaluate as a hex value
            endRange = t;
        } catch (NumberFormatException n) {
            endRangeField.setText("0x" + Integer.toHexString(endRange));
        }
    }

    public void validateInput() {
        validateRow();
        validateColumn();
        validateCellWidth();
        validateCellHeight();
        validateFontSize();
        validateTopPad();
        validateBottomPad();
        validateRightPad();
        validateLeftPad();
    }

    private void fontSizeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontSizeFieldActionPerformed
        validateFontSize();
    }//GEN-LAST:event_fontSizeFieldActionPerformed

    private void cellWidthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellWidthFieldActionPerformed
        validateCellWidth();
    }//GEN-LAST:event_cellWidthFieldActionPerformed

    private void cellHeightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellHeightFieldActionPerformed
        validateCellHeight();
    }//GEN-LAST:event_cellHeightFieldActionPerformed

    private void foregroundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foregroundButtonActionPerformed
        foreColorPanel.setBackground(SColorFactory.showSColorChooser(this));
    }//GEN-LAST:event_foregroundButtonActionPerformed

    private void backgroundButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backgroundButtonActionPerformed
        backColorPanel.setBackground(SColorFactory.showSColorChooser(this));
    }//GEN-LAST:event_backgroundButtonActionPerformed

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        validateStartRange();
        validateEndRange();
        String s = "";
        for (int codepoint = startRange; codepoint <= endRange; codepoint++) {
            for (char c : Character.toChars(codepoint)) {
                s += c;
            }
        }
        inputTextArea.setText(s);
    }//GEN-LAST:event_generateButtonActionPerformed

    private void loadFontButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFontButtonActionPerformed
        final JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        chooser.setDialogTitle("Choose a TTF font.");
        chooser.setCurrentDirectory(new File("."));
        chooser.setFileFilter(new FileNameExtensionFilter("TTF Files", "ttf"));
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
                File file = chooser.getSelectedFile();
                Font font = Font.createFont(Font.TRUETYPE_FONT, file);
                GraphicsEnvironment.getLocalGraphicsEnvironment().registerFont(font);
                fontComboBox.addItem(font.getFontName());
                fontComboBox.setSelectedItem(font.getFontName());
            } catch (FontFormatException | IOException ex) {
            }
        }
    }//GEN-LAST:event_loadFontButtonActionPerformed

    private void topPaddingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topPaddingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topPaddingFieldActionPerformed

    private void leftPaddingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftPaddingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_leftPaddingFieldActionPerformed

    private void bottomPaddingFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomPaddingFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bottomPaddingFieldActionPerformed

    public int getGridHeight() {
        return rows;
    }

    public int getGridWidth() {
        return columns;
    }

    public int getCellWidth() {
        return cellWidth;
    }

    public int getCellHeight() {
        return cellHeight;
    }

    public int getFontSize() {
        return fontSize;
    }

    public int getLeftPad() {
        return leftPad;
    }

    public int getRightPad() {
        return rightPad;
    }

    public int getTopPad() {
        return topPad;
    }

    public int getBottomPad() {
        return bottomPad;
    }

    public Font getFontFace() {
        Font font = new Font((String) fontComboBox.getSelectedItem(), getFontStyle(), fontSize);
        return font;
    }

    private int getFontStyle() {
        if (boldCheckBox.isSelected()) {
            if (italicsCheckBox.isSelected()) {
                return Font.BOLD + Font.ITALIC;
            }
            return Font.BOLD;
        } else if (italicsCheckBox.isSelected()) {
            return Font.ITALIC;
        } else {
            return Font.PLAIN;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JCheckBox antialiasBox;
    public javax.swing.JPanel backColorPanel;
    private javax.swing.JButton backgroundButton;
    private javax.swing.JCheckBox boldCheckBox;
    public javax.swing.JTextField bottomPaddingField;
    public javax.swing.JTextField cellHeightField;
    public javax.swing.JTextField cellWidthField;
    public javax.swing.JToggleButton colorizeToggleButton;
    private javax.swing.JTextField endRangeField;
    private javax.swing.JComboBox fontComboBox;
    public javax.swing.JTextField fontSizeField;
    public javax.swing.JPanel foreColorPanel;
    private javax.swing.JButton foregroundButton;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField gridHeightField;
    private javax.swing.JTextField gridWidthField;
    public javax.swing.JTextArea inputTextArea;
    private javax.swing.JCheckBox italicsCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    public javax.swing.JTextField leftPaddingField;
    private javax.swing.JButton loadFontButton;
    public javax.swing.JTextField rightPaddingField;
    private javax.swing.JTextField startRangeField;
    public javax.swing.JTextField topPaddingField;
    public javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
    //custom variables
    private int rows = 80, columns = 50, cellWidth = 24, cellHeight = 24, fontSize = 34, startRange = 0x20, endRange = 0x7E, leftPad = 0, rightPad = 0, topPad = 0, bottomPad = 0;
}
