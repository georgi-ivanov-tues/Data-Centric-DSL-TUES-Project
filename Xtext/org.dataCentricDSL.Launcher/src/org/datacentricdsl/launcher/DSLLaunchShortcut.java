package org.datacentricdsl.launcher;

import java.awt.Component;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import bg.tues.DCL.DCLInterpreter;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;

public class DSLLaunchShortcut implements ILaunchShortcut2 {

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection newSelection = ((IStructuredSelection) selection);
			if (newSelection.getFirstElement() instanceof IResource) {
				IResource resource = (IResource) newSelection.getFirstElement();
				IPath absolutePath = resource.getLocation();
				System.out.println(absolutePath);
				
				//Component frame = null;
				//JOptionPane.showMessageDialog(frame, "Something useful will show when Joni and Kiro make the API." + "File Path  = " + absolutePath);
					
				DCLInterpreter interpreter = new DCLInterpreter();
				try {
					interpreter.execute(absolutePath.toString());
					/*Component frame = null;
					JOptionPane.showMessageDialog(frame, "File = " + absolutePath + " was successfully read");*/
				} catch (IOException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
	}

	@Override
	public void launch(IEditorPart arg0, String arg1) {
		// TODO Auto-generated method stub
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(ISelection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ILaunchConfiguration[] getLaunchConfigurations(IEditorPart arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResource getLaunchableResource(ISelection arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResource getLaunchableResource(IEditorPart arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
