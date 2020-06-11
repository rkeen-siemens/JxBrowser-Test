/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.siemens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;

@ActionID(
        category = "Window",
        id = "com.siemens.OpenEmbeddedBrowser"
)
@ActionRegistration(
        displayName = "#CTL_OpenEmbeddedBrowser"
)
@ActionReference(path = "Menu/Window/Web", position = 0)
@Messages("CTL_OpenEmbeddedBrowser=Embedded Browser")
public final class OpenEmbeddedBrowser implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        SwingUtilities.invokeLater(this::openBrowser);
    }
    
    private void openBrowser() {
        BrowserTopComponent tc = new BrowserTopComponent();
        tc.open();
        tc.requestActive();
        tc.getBrowser().navigation().loadUrl("http://google.com");
    }
}
