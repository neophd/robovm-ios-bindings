package org.robovm.bindings.gpgs;

import org.robovm.apple.foundation.NSError;

public interface GPGSnapshotCompletionBlock {
	void invoke(NSError error);
}
