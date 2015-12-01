package de.ostbot.sensi.view.DefiziteDefinieren;

public class JPanelMakroelemente extends javax.swing.JPanel {

    public int getjSliderStickstoff() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderStickstoff.getValue();
        return rueckgabe;
    }
    
    public int getjSliderPhosphor() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderPhosphor.getValue();
        return rueckgabe;
    }
    
    public int getjSliderKalium() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderKalium.getValue();
        return rueckgabe;
    }

    public int getjSliderKalzium() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderKalzium.getValue();
        return rueckgabe;
    }
    
    public int getjSliderSchwefel() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderSchwefel.getValue();
        return rueckgabe;
    }
    
    public int getjSliderMagnesium() {
        int rueckgabe;
        rueckgabe = (Integer)jSliderMagnesium.getValue();
        return rueckgabe;
    }

    public JPanelMakroelemente() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelHintergrund = new javax.swing.JPanel();
        jLabelMakroelemente = new javax.swing.JLabel();
        jLabelStickstoff = new javax.swing.JLabel();
        jSliderStickstoff = new javax.swing.JSlider();
        jLabelStickstoffAnzeige = new javax.swing.JLabel();
        jLabelPhosphor = new javax.swing.JLabel();
        jSliderPhosphor = new javax.swing.JSlider();
        jLabelPhosphorAnzeige = new javax.swing.JLabel();
        jLabelKalium = new javax.swing.JLabel();
        jSliderKalium = new javax.swing.JSlider();
        jLabelKaliumAnzeige = new javax.swing.JLabel();
        jLabelMagnesium = new javax.swing.JLabel();
        jSliderSchwefel = new javax.swing.JSlider();
        jLabelSchwefelAnzeige = new javax.swing.JLabel();
        jLabelKalzium = new javax.swing.JLabel();
        jSliderKalzium = new javax.swing.JSlider();
        jLabelKalziumAnzeige = new javax.swing.JLabel();
        jLabelSchwefel1 = new javax.swing.JLabel();
        jSliderMagnesium = new javax.swing.JSlider();
        jLabelMagnesiumAnzeige = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));

        jLabelMakroelemente.setText("Makroelemente:");

        jLabelStickstoff.setText("Stickstoff:");

        jLabelStickstoffAnzeige.setText("0");

        jLabelPhosphor.setText("Phosphor:");

        jLabelPhosphorAnzeige.setText("0");

        jLabelKalium.setText("Kalium:");

        jLabelKaliumAnzeige.setText("0");

        jLabelMagnesium.setText("Magnesium:");

        jLabelSchwefelAnzeige.setText("0");

        jLabelKalzium.setText("Kalzium:");

        jLabelKalziumAnzeige.setText("0");

        jLabelSchwefel1.setText("Schwefel:");

        jLabelMagnesiumAnzeige.setText("0");

        javax.swing.GroupLayout jPanelHintergrundLayout = new javax.swing.GroupLayout(jPanelHintergrund);
        jPanelHintergrund.setLayout(jPanelHintergrundLayout);
        jPanelHintergrundLayout.setHorizontalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMakroelemente)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelKalium)
                            .addComponent(jLabelKalzium)
                            .addComponent(jLabelPhosphor)
                            .addComponent(jLabelStickstoff)
                            .addComponent(jLabelMagnesium)
                            .addComponent(jLabelSchwefel1))
                        .addGap(92, 92, 92)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSliderSchwefel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMagnesiumAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSliderMagnesium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelKalziumAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSliderKalzium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelSchwefelAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addComponent(jSliderKalium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelKaliumAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                        .addComponent(jSliderStickstoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelStickstoffAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                                        .addComponent(jSliderPhosphor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelPhosphorAnzeige, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanelHintergrundLayout.setVerticalGroup(
            jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMakroelemente, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSliderStickstoff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStickstoff, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelStickstoffAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelHintergrundLayout.createSequentialGroup()
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPhosphor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPhosphorAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSliderKalium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKalium, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKaliumAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSliderPhosphor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSchwefelAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelKalzium, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderKalzium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelKalziumAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMagnesium, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderMagnesium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelHintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMagnesiumAnzeige, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSliderSchwefel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSchwefel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelHintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelKalium;
    private javax.swing.JLabel jLabelKaliumAnzeige;
    private javax.swing.JLabel jLabelKalzium;
    private javax.swing.JLabel jLabelKalziumAnzeige;
    private javax.swing.JLabel jLabelMagnesium;
    private javax.swing.JLabel jLabelMagnesiumAnzeige;
    private javax.swing.JLabel jLabelMakroelemente;
    private javax.swing.JLabel jLabelPhosphor;
    private javax.swing.JLabel jLabelPhosphorAnzeige;
    private javax.swing.JLabel jLabelSchwefel1;
    private javax.swing.JLabel jLabelSchwefelAnzeige;
    private javax.swing.JLabel jLabelStickstoff;
    private javax.swing.JLabel jLabelStickstoffAnzeige;
    private javax.swing.JPanel jPanelHintergrund;
    private javax.swing.JSlider jSliderKalium;
    private javax.swing.JSlider jSliderKalzium;
    private javax.swing.JSlider jSliderMagnesium;
    private javax.swing.JSlider jSliderPhosphor;
    private javax.swing.JSlider jSliderSchwefel;
    private javax.swing.JSlider jSliderStickstoff;
    // End of variables declaration//GEN-END:variables
}