<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<HTML>
<HEAD>
<TITLE>A Sample FORM using POST</TITLE>
</HEAD>
<BODY BGCOLOR="#FDF5E6">
<H1 ALIGN="CENTER">A Sample FORM using POST</H1>
<FORM ACTION="http://localhost:8080/ShowParameters/ShowParameters" METHOD="POST">
Item Number: <INPUT TYPE="TEXT" NAME="itemNum"><BR>
Quantity: <INPUT TYPE="TEXT" NAME="quantity"><BR>
Price Each: <INPUT TYPE="TEXT" NAME="price" VALUE="$"><BR>
<HR>
First Name: <INPUT TYPE="TEXT" NAME="firstName"><BR>
Last Name: <INPUT TYPE="TEXT" NAME="lastName"><BR>
Middle Initial: <INPUT TYPE="TEXT" NAME="initial"><BR>
Shipping Address:
<TEXTAREA NAME="address" ROWS=3 COLS=40></TEXTAREA><BR>
Credit Card:<BR>
&nbsp;&nbsp;<INPUT TYPE="RADIO" NAME="cardType"
VALUE="Visa">Visa<BR>
&nbsp;&nbsp;<INPUT TYPE="RADIO" NAME="cardType"
VALUE="Master Card">Master Card<BR>
&nbsp;&nbsp;<INPUT TYPE="RADIO" NAME="cardType"
VALUE="Amex">American Express<BR>
&nbsp;&nbsp;<INPUT TYPE="RADIO" NAME="cardType"
VALUE="Discover">Discover<BR>
&nbsp;&nbsp;<INPUT TYPE="RADIO" NAME="cardType"
VALUE="Java SmartCard">Java SmartCard<BR>
Credit Card Number:
<INPUT TYPE="PASSWORD" NAME="cardNum"><BR>
Repeat Credit Card Number:
<INPUT TYPE="PASSWORD" NAME="cardNum"><BR><BR>
<CENTER>
<INPUT TYPE="SUBMIT" VALUE="Submit Order">
</CENTER>
</FORM>
</BODY>
</HTML>