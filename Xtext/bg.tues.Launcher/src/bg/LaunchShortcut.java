package bg;

import java.io.IOException;
import java.io.PrintStream;
import java.sql.SQLException;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.ui.ILaunchShortcut2;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import bg.tues.didi.DCLInterpreter;


public class LaunchShortcut implements ILaunchShortcut2 {

	@Override
	public void launch(ISelection selection, String mode) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection newSelection = ((IStructuredSelection) selection);
			if (newSelection.getFirstElement() instanceof IResource) {
				IResource resource = (IResource) newSelection.getFirstElement();
				IPath absolutePath = resource.getLocation();

				DCLInterpreter interpreter = new DCLInterpreter();
				MessageConsole myConsole = findConsole("DD Console");
				MessageConsoleStream out = myConsole.newMessageStream();
				PrintStream printStream = new PrintStream(out);

				executeScriptASync(absolutePath, interpreter, printStream); 
			}

		}
	}

	private void executeScriptASync(final IPath absolutePath, final DCLInterpreter interpreter,
			final PrintStream printStream){
		Job job = new Job("My Job") {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				monitor.beginTask("Doing something time consuming here", 100);
				try {
					executeScript(absolutePath, interpreter, printStream);

				} catch (Exception e1) {
					e1.printStackTrace();
					return Status.CANCEL_STATUS;
				}

				return Status.OK_STATUS;
			}
		};
		job.schedule(); 

	}

	private void executeScript(IPath absolutePath, DCLInterpreter interpreter,
			PrintStream printStream) throws IOException, SQLException, Exception {
		System.setErr(printStream);
		interpreter.execute(absolutePath.toString(), printStream);

	}

	private MessageConsole findConsole(String name) {

		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();

		IConsole[] existing = conMan.getConsoles();
		//if console exists, clear it 
		for (int i = 0; i < existing.length; i++)
			if (name.equals(existing[i].getName())){
				((MessageConsole) existing[i]).clearConsole();
			}

		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
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
