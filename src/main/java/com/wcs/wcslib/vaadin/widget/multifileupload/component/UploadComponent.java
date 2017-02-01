/*
 * Copyright 2013 gergo.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wcs.wcslib.vaadin.widget.multifileupload.component;

import com.vaadin.ui.Component;
import com.vaadin.ui.DragAndDropWrapper;

import java.util.List;

/**
 *
 * @author gergo
 */
public interface UploadComponent extends Component, Component.Focusable {

    void setMaxFileSize(long maxFileSize);

    void setSizeErrorMsgPattern(String pattern);

    void setAcceptFilter(String acceptFilter);

    void setAcceptedMimeTypes(List<String> acceptedMimeTypes);

    void setMimeTypeErrorMsgPattern(String pattern);

    void setButtonCaption(String buttonCaption);

    void interruptUpload(long fileId);

    void registerDropComponent(MultiUploadDropHandler dropHandler);

    void setFileCountErrorMsgPattern(String pattern);

}
