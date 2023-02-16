// Generated by view binder compiler. Do not edit!
package com.ahmed.nytimes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.ahmed.nytimes.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemArticleBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final MaterialCardView articleCard;

  @NonNull
  public final View dots;

  @NonNull
  public final MaterialCardView imageContainer;

  @NonNull
  public final ImageView imageViewArticle;

  @NonNull
  public final TextView section;

  @NonNull
  public final TextView tvAbstract;

  @NonNull
  public final TextView tvByline;

  @NonNull
  public final TextView tvPublished;

  @NonNull
  public final TextView tvTitle;

  private ItemArticleBinding(@NonNull MaterialCardView rootView,
      @NonNull MaterialCardView articleCard, @NonNull View dots,
      @NonNull MaterialCardView imageContainer, @NonNull ImageView imageViewArticle,
      @NonNull TextView section, @NonNull TextView tvAbstract, @NonNull TextView tvByline,
      @NonNull TextView tvPublished, @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.articleCard = articleCard;
    this.dots = dots;
    this.imageContainer = imageContainer;
    this.imageViewArticle = imageViewArticle;
    this.section = section;
    this.tvAbstract = tvAbstract;
    this.tvByline = tvByline;
    this.tvPublished = tvPublished;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemArticleBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemArticleBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_article, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemArticleBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      MaterialCardView articleCard = (MaterialCardView) rootView;

      id = R.id.dots;
      View dots = ViewBindings.findChildViewById(rootView, id);
      if (dots == null) {
        break missingId;
      }

      id = R.id.image_container;
      MaterialCardView imageContainer = ViewBindings.findChildViewById(rootView, id);
      if (imageContainer == null) {
        break missingId;
      }

      id = R.id.image_view_article;
      ImageView imageViewArticle = ViewBindings.findChildViewById(rootView, id);
      if (imageViewArticle == null) {
        break missingId;
      }

      id = R.id.section;
      TextView section = ViewBindings.findChildViewById(rootView, id);
      if (section == null) {
        break missingId;
      }

      id = R.id.tv_abstract;
      TextView tvAbstract = ViewBindings.findChildViewById(rootView, id);
      if (tvAbstract == null) {
        break missingId;
      }

      id = R.id.tv_byline;
      TextView tvByline = ViewBindings.findChildViewById(rootView, id);
      if (tvByline == null) {
        break missingId;
      }

      id = R.id.tv_published;
      TextView tvPublished = ViewBindings.findChildViewById(rootView, id);
      if (tvPublished == null) {
        break missingId;
      }

      id = R.id.tv_title;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new ItemArticleBinding((MaterialCardView) rootView, articleCard, dots, imageContainer,
          imageViewArticle, section, tvAbstract, tvByline, tvPublished, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}