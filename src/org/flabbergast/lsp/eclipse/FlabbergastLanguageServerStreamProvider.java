package org.flabbergast.lsp.eclipse;

import java.io.File;
import java.util.Arrays;

import org.eclipse.lsp4e.server.ProcessStreamConnectionProvider;
import org.eclipse.lsp4e.server.StreamConnectionProvider;

public class FlabbergastLanguageServerStreamProvider extends ProcessStreamConnectionProvider
		implements StreamConnectionProvider {

	public FlabbergastLanguageServerStreamProvider() {
		super(Arrays.asList("flabbergast-language-server"), new File(".").getAbsolutePath());
	}

}
