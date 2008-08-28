/**
 * 
 */
package org.pentaho.ui.xul.swing.tags;

import org.dom4j.Element;
import org.pentaho.ui.xul.XulContainer;
import org.pentaho.ui.xul.XulTagHandler;
import org.pentaho.ui.xul.XulWindowContainer;

/**
 * @author OEM
 *
 */
public class SwingCaptionHandler implements XulTagHandler{
  
  public SwingCaption parse(Element element, XulContainer parent, XulWindowContainer xulWindowContainer) {
    //TODO: break out to factory
    String text = element.attributeValue("label");
    return new SwingCaption(text);

  }
}