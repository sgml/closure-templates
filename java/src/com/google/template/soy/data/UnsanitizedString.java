/*
 * Copyright 2018 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.template.soy.data;

import com.google.template.soy.data.restricted.SoyString;
import javax.annotation.Nullable;

/** A sanitized content that implements SoyString. This is only relevant to kind=TEXT */
public final class UnsanitizedString extends SanitizedContent implements SoyString {

  static UnsanitizedString create(String content, @Nullable Dir dir) {
    return new UnsanitizedString(content, dir);
  }

  /** Creates a UnsanitizedString object with default direction. */
  static UnsanitizedString create(String content) {
    return new UnsanitizedString(content);
  }

  private UnsanitizedString(String content, @Nullable Dir dir) {
    super(content, ContentKind.TEXT, dir);
  }

  private UnsanitizedString(String content) {
    super(content, ContentKind.TEXT, ContentKind.TEXT.getDefaultDir());
  }
}
