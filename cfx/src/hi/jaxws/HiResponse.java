
package hi.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.16
 * Tue Jan 02 16:30:12 IST 2018
 * Generated source version: 3.0.16
 */

@XmlRootElement(name = "hiResponse", namespace = "http://hi/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hiResponse", namespace = "http://hi/")

public class HiResponse {

    @XmlElement(name = "return")
    private java.lang.String _return;

    public java.lang.String getReturn() {
        return this._return;
    }

    public void setReturn(java.lang.String new_return)  {
        this._return = new_return;
    }

}

