package com.antarikshc.intrack.data

import android.content.ContentResolver
import android.net.Uri
import android.provider.BaseColumns

object InvContract {

    //Inv, Invent, Inventory it's all same

    /**
     * Constants for ContentProvider
     */
    val CONTENT_AUTHORITY = "com.antarikshc.intrack"
    private val BASE_CONTENT_URI = Uri.parse("content://$CONTENT_AUTHORITY")
    val PATH_INVENT = "invent"
    val CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI, PATH_INVENT)

    abstract class InvEntry : BaseColumns {
        companion object {

            /**
             * Constants for invent table
             */
            val TABLE_NAME = "invent"
            val _ID = BaseColumns._ID
            val COLUMN_ITEM_NAME = "name"
            val COLUMN_ITEM_STOCK = "stock"
            val COLUMN_ITEM_CAPACITY = "capacity"
            val COLUMN_ITEM_ICON = "icon"
            val COLUMN_ITEM_SUP_PHONE = "supplier_phone"
            val COLUMN_ITEM_SUP_EMAIL = "supplier_email"


            /**
             * The MIME type of the [.CONTENT_URI] for a list of inventory items.
             */
            val CONTENT_LIST_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENT

            /**
             * The MIME type of the [.CONTENT_URI] for a inventory item.
             */
            val CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_INVENT
        }


    }
}