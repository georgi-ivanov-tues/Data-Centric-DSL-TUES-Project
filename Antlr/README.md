#DataCentricDSL ANTLR
-------
##Before we can begin we will need to:
* Download Eclipse from: https://eclipse.org/downloads/
* Download ANTLR3 jar file:  https://www.antlr3.org/download/antlr-3.5.2-complete.jar and save it in an appropriate permanent location

Once you start up Eclipse go to <b>Help -> Install New Software</b><br>
In the <b>Work with</b> section type in: http://download.eclipse.org/releases/indigo/<br>
Under the <b>"General Purpose Tools"</b> group, install <b>"Dynamic Languages Toolkit - Core Framework" (v3.x)</b>

Then type in the <b>Work with</b> section: http://download.eclipse.org/tools/gef/updates/releases/<br>
And from From the <b>GEF (Graphical Editing Framework)</b> plugin repository install <b>"Zest Visualization Toolkit" (v1.x)</b>

<b>Notice that you are installing the correct versions!</b> Installing too advanced version will prevent you from installing some or all features of ANTLR IDE.

Once both are installed, you can install ANTLR IDE from http://antlrv3ide.sourceforge.net/updates plugin repository. 

<b>Configure the ANTLR IDE:</b>

1.  In the Eclipse main window, click Window then Preferences.
2.  In the left pane, expand ANTLR and select Builder.
3.  In the right pane, click the Add… button.
4.  In the Add ANTLR Package window, click Directory… and navigate to the location of the antlr.jar and click OK.
5.  Click OK to close the Add ANTLR Package window.
6.  Select Code Generator in the left pane and click on Project relative folder in the right pane. Type a folder name. Examples: antlr-java or antlr-generated.
7.  Select any other configuration parameters but DO NOT check –nfa or –dfa in the under General in the Building window. If checked, these will cause ANTLR errors preventing java files from being generated in the output folder.
8.  Click OK to close the Preferences window.


##Try the language
* Run Test.java from the project
* Write your code
* When you're done with your input, write end
* The code you just wrote will execute

<b>Grammar</b>

Currently, the language supports just one function - query, which takes a string as argument.
