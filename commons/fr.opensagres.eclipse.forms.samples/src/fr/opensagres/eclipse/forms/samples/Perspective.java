package fr.opensagres.eclipse.forms.samples;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout.addView(View.ID, IPageLayout.LEFT, 0.25f,
				"org.eclipse.ui.editorss");

	}
}
